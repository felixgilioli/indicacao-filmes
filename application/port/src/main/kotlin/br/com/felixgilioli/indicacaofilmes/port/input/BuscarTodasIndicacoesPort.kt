package br.com.felixgilioli.indicacaofilmes.port.input

import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao

interface BuscarTodasIndicacoesPort {

    fun buscar(): Set<Indicacao>
}