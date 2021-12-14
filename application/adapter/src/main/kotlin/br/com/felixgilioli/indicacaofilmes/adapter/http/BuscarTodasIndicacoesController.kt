package br.com.felixgilioli.indicacaofilmes.adapter.http

import br.com.felixgilioli.indicacaofilmes.port.input.BuscarTodasIndicacoesPort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/indicacao")
class BuscarTodasIndicacoesController(private val buscarTodasIndicacoesPort: BuscarTodasIndicacoesPort) {

    @GetMapping
    fun buscarTodas() = buscarTodasIndicacoesPort.buscar()
}