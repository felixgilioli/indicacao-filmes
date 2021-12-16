package br.com.felixgilioli.indicacaofilmes.adapter.http

import br.com.felixgilioli.indicacaofilmes.port.input.BuscarTodasIndicacoesPort
import br.com.felixgilioli.indicacaofilmes.port.input.RegistrarIndicacaoPort
import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import org.springframework.web.bind.annotation.*
import java.security.Principal

@RestController
@RequestMapping("/indicacao")
class IndicacaoController(
    private val buscarTodasIndicacoesPort: BuscarTodasIndicacoesPort,
    private val registrarIndicacaoPort: RegistrarIndicacaoPort
) {

    @GetMapping
    fun buscarTodas(): Set<Indicacao> {
        return buscarTodasIndicacoesPort.buscar()
    }

    @PostMapping
    fun registrar(@RequestBody indicacaoInput: IndicacaoInput, principal: Principal) =
        registrarIndicacaoPort.registra(indicacaoInput.toIndicacao(principal.name))

}
