package br.com.felixgilioli.indicacaofilmes.port.input

import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import br.com.felixgilioli.indicacaofilmes.port.model.Pagina
import br.com.felixgilioli.indicacaofilmes.port.model.PaginaRequest

interface BuscarTodasIndicacoesPort {

    fun buscar(paginaRequest: PaginaRequest): Pagina<Indicacao>
}