package br.com.felixgilioli.indicacaofilmes.adapter.http

import br.com.felixgilioli.indicacaofilmes.port.input.BuscarTodasIndicacoesPort
import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
@RequestMapping("/indicacao")
class BuscarTodasIndicacoesController(private val buscarTodasIndicacoesPort: BuscarTodasIndicacoesPort) {

    @GetMapping
    fun buscarTodas(principal: Principal): Set<Indicacao> {
        println(principal)
        return buscarTodasIndicacoesPort.buscar()
    }
}