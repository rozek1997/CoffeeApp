package com.example.coffeeworld.Config;

import com.example.coffeeworld.Service.UserAuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;


@Configuration
@EnableAuthorizationServer
public class AuthServiceConfig extends AuthorizationServerConfigurerAdapter {

    private final AuthenticationManager authenticationManager;
    @Autowired
    private UserAuthorizationService userAuthorizationService;

    @Autowired
    public AuthServiceConfig(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        super.configure(clients);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager);
        endpoints.userDetailsService(userAuthorizationService);
    }
}
