package com.packt.example.authcodeserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServer extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients)
            throws Exception {
        //@formatter:off
        clients.inMemory()
            .withClient("clientapp")
            .secret("{noop}123456")
            .redirectUris("http://localhost:8201/callback")
            .authorizedGrantTypes("authorization_code")
            .scopes("read_profile", "read_contacts");

        clients.inMemory()
                .withClient("client8301")
                .secret("{noop}123456")
                .redirectUris("http://localhost:8301/callback")
                .authorizedGrantTypes("authorization_code")
                .scopes("read_profile", "read_contacts");
        //@formatter:on
    }

}
