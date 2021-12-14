package br.com.felixgilioli.indicacaofilmes.port.model

data class Indicacao(
    val nome: String,
    val ano: Int,
    val tipo: TipoIndicacao
)

enum class TipoIndicacao {
    FILME,
    SERIE
}