package br.com.felixgilioli.indicacaofilmes.core.indicacao

import br.com.felixgilioli.indicacaofilmes.port.input.RegistrarIndicacaoPort
import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import br.com.felixgilioli.indicacaofilmes.port.output.PersisteIndicacaoPort

class RegistrarIndicacaoImpl(private val persisteIndicacaoPort: PersisteIndicacaoPort) : RegistrarIndicacaoPort {

    override fun registra(indicacao: Indicacao) {
        println(indicacao)
        persisteIndicacaoPort.persist(indicacao)
    }
}