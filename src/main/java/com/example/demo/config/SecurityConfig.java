/*
*  2018 
*/
package com.example.demo.config;

import com.example.demo.service.ReaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author wangdan Date: 2018/12/9 Time: 10:53
 * @version $Id$
 */

@Configuration
@Slf4j
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ReaderService readerService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.info("load sercurityconfig....");
                http
                .authorizeRequests()
                .antMatchers("/")
                .access("hasRole('READER')")
                .antMatchers("/**")
                .permitAll()
                .and()
                .formLogin()
                .loginPage("/book")
                .failureUrl("/login?error=true");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
                log.info("load auth.....");
                auth
                .userDetailsService(new UserDetailsService() {
                    @Override
                    public UserDetails loadUserByUsername(String username)
                            throws UsernameNotFoundException {
                        UserDetails userDetails = readerService.findOneByUserName(username);
                        if (userDetails != null) {
                            return userDetails;
                        }
                        throw new UsernameNotFoundException("User '" + username + "' not found.");
                    }
                });
    }
}