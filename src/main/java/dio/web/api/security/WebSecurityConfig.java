package dio.web.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled =true)
public class WebSecurityConfig {

	@Bean
	public UserDetailsService users() {
		UserDetails user = User.builder()
			.username("user")
			.password("{noop}user123")
			.roles("USERS")
			.build();
		UserDetails admin = User.builder()
			.username("admin")
			.password("{noop}master123")
			.roles("MANAGERS")
			.build();
		return new InMemoryUserDetailsManager(user, admin);
	}

}
	

