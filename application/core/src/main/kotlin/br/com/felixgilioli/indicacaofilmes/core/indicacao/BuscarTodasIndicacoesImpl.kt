package br.com.felixgilioli.indicacaofilmes.core.indicacao

import br.com.felixgilioli.indicacaofilmes.port.input.BuscarTodasIndicacoesPort
import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import br.com.felixgilioli.indicacaofilmes.port.model.Pagina
import br.com.felixgilioli.indicacaofilmes.port.model.PaginaRequest
import br.com.felixgilioli.indicacaofilmes.port.output.RecuperarIndicacoesPaginadasPort

class BuscarTodasIndicacoesImpl(private val recuperarIndicacoesPaginadasPort: RecuperarIndicacoesPaginadasPort) : BuscarTodasIndicacoesPort {

    override fun buscar(paginaRequest: PaginaRequest): Pagina<Indicacao> = recuperarIndicacoesPaginadasPort.recuperar(paginaRequest)
}