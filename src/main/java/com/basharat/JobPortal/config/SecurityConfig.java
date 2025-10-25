package com.basharat.JobPortal.config;


import com.fasterxml.jackson.databind.annotation.EnumNaming;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration  // This class provides Spring Security configuration for the application
@EnableWebSecurity  // Enables Spring Security web security support
public class SecurityConfig {

    /*
     * Bean for AuthenticationManager
     * This bean is required to handle authentication operations.
     * @param authenticationConfiguration The configuration used to create the AuthenticationManager
     * @return The AuthenticationManager bean
     * @throws Exception if the AuthenticationManager could not be created
     */
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors(Customizer.withDefaults())  // Enable CORS
                .csrf(csrf -> csrf.disable())     // Disable CSRF
                .authorizeHttpRequests(auth -> auth
                                .requestMatchers("/api/users/register", "/api/users/login","/swagger-ui.html",
                                "/swagger-ui/**",
                                "/v3/api-docs/**").permitAll()
                                .requestMatchers("/api/employees/register").permitAll()

                                .requestMatchers("/api/users/username/**","/api/users/email/**").permitAll()
                                .requestMatchers("/api/employees/update","/api/employees/user/**").permitAll()
                                .requestMatchers("/api/jobs/**").permitAll()
                                .requestMatchers("/api/job-applications/**").permitAll()
                                .requestMatchers("/api/job-categories/**").permitAll()
                                .anyRequest().authenticated()// Secure all others
                )
//                .formLogin(Customizer.withDefaults())
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)// Stateless (for JWT)
                );


        return http.build();
    }


    /*
     * Bean for PasswordEncoder
     * This bean provides a password encoder for securely hashing passwords.
     * @return The PasswordEncoder bean (BCrypt implementation)
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Use BCrypt for password encoding.
    }

    /*
     * Bean for CorsConfigurationSource
     * This bean configures CORS settings for the application.
     * @return The CorsConfigurationSource bean
     */
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("http://localhost:3000"));  // Allow requests from the React frontend.
//        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "PATCH"));  // Allow common HTTP methods.
//        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type"));  // Allow headers necessary for security.
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);  // Apply CORS settings to all endpoints.
//        return source;  // Return the configured CORS source.
//    }
    // In-memory test user
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
//        UserDetails user = User.builder()
//                .username("testuser")
//                .password(passwordEncoder.encode("password123"))
//                .roles("USER")
//                .build();
//        return new InMemoryUserDetailsManager(user);
//    }
}


