package br.com.felixgilioli.indicacaofilmes.adapter.http

import br.com.felixgilioli.indicacaofilmes.port.input.BuscarTodasIndicacoesPort
import br.com.felixgilioli.indicacaofilmes.port.input.RegistrarIndicacaoPort
import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import br.com.felixgilioli.indicacaofilmes.port.model.Pagina
import br.com.felixgilioli.indicacaofilmes.port.model.PaginaRequest
import org.springframework.web.bind.annotation.*
import java.security.Principal

@RestController
@RequestMapping("/indicacao")
class IndicacaoController(
    private val buscarTodasIndicacoesPort: BuscarTodasIndicacoesPort,
    private val registrarIndicacaoPort: RegistrarIndicacaoPort
) {

    @GetMapping
    fun buscarTodas(@RequestParam("pagina") pagina: Int, @RequestParam("tamanho") tamanho: Int): Pagina<Indicacao> {
        return buscarTodasIndicacoesPort.buscar(PaginaRequest(pagina, tamanho))
    }

    @PostMapping
    fun registrar(@RequestBody indicacaoInput: IndicacaoInput, principal: Principal) =
        registrarIndicacaoPort.registra(indicacaoInput.toIndicacao(principal.name))

}
