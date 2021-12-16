package br.com.felixgilioli.indicacaofilmes.adapter.config

import br.com.felixgilioli.indicacaofilmes.core.indicacao.BuscarTodasIndicacoesImpl
import br.com.felixgilioli.indicacaofilmes.core.indicacao.RegistrarIndicacaoImpl
import br.com.felixgilioli.indicacaofilmes.port.input.BuscarTodasIndicacoesPort
import br.com.felixgilioli.indicacaofilmes.port.input.RegistrarIndicacaoPort
import br.com.felixgilioli.indicacaofilmes.port.output.PersisteIndicacaoPort
import br.com.felixgilioli.indicacaofilmes.port.output.RecuperarIndicacoesPaginadasPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationBeanConfig {

    @Bean
    fun buscarTodasIndicacoesPort(recuperarIndicacoesPaginadasPort: RecuperarIndicacoesPaginadasPort): BuscarTodasIndicacoesPort =
        BuscarTodasIndicacoesImpl(recuperarIndicacoesPaginadasPort)

    @Bean
    fun registrarIndicacaoPort(persisteIndicacaoPort: PersisteIndicacaoPort): RegistrarIndicacaoPort =
        RegistrarIndicacaoImpl(persisteIndicacaoPort)
}