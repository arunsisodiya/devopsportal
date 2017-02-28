package com.accenture.devops.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by arun.singh.sisodiya on 2/21/2017.
 */
@Configuration
public class DevopsConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception
    {
       http.authorizeRequests().antMatchers("/").permitAll();
       http.csrf().disable();
    }
}
