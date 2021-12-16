package br.com.felixgilioli.indicacaofilmes.port.model

data class PaginaRequest(
    val pagina: Int,
    val tamanho: Int
)
