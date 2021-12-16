package br.com.felixgilioli.indicacaofilmes.port.output

import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao

interface PersisteIndicacaoPort {

    fun persist(indicacao: Indicacao)
}