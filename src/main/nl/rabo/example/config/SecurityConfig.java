package main.nl.rabo.example.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .requestMatchers("/", "/register").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable(); // Optional: Disable CSRF for simplicity during development
        return http.build();
    }
}
