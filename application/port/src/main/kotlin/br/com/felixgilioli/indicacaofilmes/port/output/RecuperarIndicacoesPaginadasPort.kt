package br.com.felixgilioli.indicacaofilmes.port.output

import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import br.com.felixgilioli.indicacaofilmes.port.model.Pagina
import br.com.felixgilioli.indicacaofilmes.port.model.PaginaRequest

interface RecuperarIndicacoesPaginadasPort {

    fun recuperar(paginaRequest: PaginaRequest): Pagina<Indicacao>
}