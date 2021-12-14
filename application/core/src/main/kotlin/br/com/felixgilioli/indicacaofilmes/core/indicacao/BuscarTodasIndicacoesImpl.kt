package br.com.felixgilioli.indicacaofilmes.core.indicacao

import br.com.felixgilioli.indicacaofilmes.port.input.BuscarTodasIndicacoesPort
import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao

class BuscarTodasIndicacoesImpl : BuscarTodasIndicacoesPort {

    override fun buscar(): Set<Indicacao> = emptySet()
}