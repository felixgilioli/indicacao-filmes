package br.com.felixgilioli.indicacaofilmes.adapter.http

import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import br.com.felixgilioli.indicacaofilmes.port.model.TipoIndicacao

data class IndicacaoInput(
    val nome: String,
    val ano: Int,
    val tipo: TipoIndicacao
) {
    fun toIndicacao(usuario: String) = Indicacao(
        nome = nome,
        ano = ano,
        tipo = tipo,
        usuario = usuario
    )
}
