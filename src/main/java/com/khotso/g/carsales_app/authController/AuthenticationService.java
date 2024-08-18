package com.khotso.g.carsales_app.authController;

import com.khotso.g.carsales_app.authRepository.UserRepository;
import com.khotso.g.carsales_app.config.JwtService;
import com.khotso.g.carsales_app.users.Role;
import com.khotso.g.carsales_app.users.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;

    private final PasswordEncoder passwordEncoder;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;



    public AuthenticationResponse register(RegisterRequest request) {
        var user = User.builder()
                .firstName(request.getFirstname())
                .lastName(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getEmail(),
                            request.getPassword()
                    )
            );
            var user = repository.findByEmail(request.getEmail())
                    .orElseThrow();

            var jwtToken = jwtService.generateToken(user);

            System.out.println("Generated Token: " + jwtToken);
            System.out.println("Successfully signed in");

            return AuthenticationResponse.builder()
                    .token(jwtToken)
                    .message("Signed in successfully")
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Authentication failed");
        }
    }

}
