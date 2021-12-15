package br.com.felixgilioli.indicacaofilmes.adapter.config

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class KeycloakResolverConfig {

    @Bean
    fun keycloakConfigResolver(): KeycloakSpringBootConfigResolver = KeycloakSpringBootConfigResolver()
}