package br.com.felixgilioli.indicacaofilmes.core.indicacao

import br.com.felixgilioli.indicacaofilmes.port.input.RegistrarIndicacaoPort
import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao

class RegistrarIndicacaoImpl : RegistrarIndicacaoPort {

    override fun registra(indicacao: Indicacao) {
        println(indicacao)
    }
}