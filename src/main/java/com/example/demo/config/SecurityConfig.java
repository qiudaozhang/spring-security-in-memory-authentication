package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Collections;

/**
 * @author 邱道长
 * 2020/12/30
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    // 必须有，否则会有非法参数异常
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails dao = User.builder()
                .username("dao")
                .password("123")
                .authorities(Collections.emptyList())
                .build();
        UserDetails azir = User.builder()
                .username("azir")
                .password("123")
                .authorities(Collections.emptyList())
                .build();
        return new InMemoryUserDetailsManager(dao,azir);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .authenticated();
        http.formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/welcome",true)
                .permitAll();
    }
}
