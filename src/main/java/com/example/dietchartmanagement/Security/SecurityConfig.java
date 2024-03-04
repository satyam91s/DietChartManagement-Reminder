// package com.example.dietchartmanagement.Security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfiguration{

//     @Bean
//     public UserDetailsService getUserDetailsService(){

//         return new UserdetailServiceImpl();
//     }

//     @Bean
//     public BCryptPasswordEncoder passwordEncoder(){

//         return new BCryptPasswordEncoder();
//     }

//     @Bean
//     public DaoAuthenticationProvider authenticationProvider(){

//         DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();

//         daoAuthenticationProvider.setUserDetailsService(this.getUserDetailsService());
//         daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());

//         return daoAuthenticationProvider;
//     }
    
//     // confirguration methods

  
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception{

//         auth.authenticationProvider(authenticationProvider());
//     }

    
//     @SuppressWarnings("removal")
//     protected void configure(HttpSecurity http) throws Exception{
//         http.authorizeRequests().antMatchers("/user/**").hasRole("user").requestMatchers("/doctor/**").hasRole("doctor").requestMatchers("/**").permitAll().and().formLogin().and().csrf().disable();
//     }
    
// }
