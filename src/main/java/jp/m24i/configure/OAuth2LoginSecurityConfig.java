package jp.m24i.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class OAuth2LoginSecurityConfig extends WebSecurityConfigurerAdapter {
  

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .oauth2Login().authorizationEndpoint().and()
//        .loginProcessingUrl("/k")
//        .loginPage("/login/login")
        .redirectionEndpoint()
        // "/api/v1/xxxx"や"/api/v1/xxxx/yyyy"にアクセスすると認証が求められる
        .baseUri("/api/v1/**");
  }
  
//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) {
//    auth.authenticationProvider(new CustomeAuthPro());
//  }
  
  @Override
  protected AuthenticationManager authenticationManager() {
    return new CustomeAuthPro();
  }
  
  

}
