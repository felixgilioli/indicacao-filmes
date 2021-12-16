package br.com.felixgilioli.indicacaofilmes.port.model

data class Pagina<T>(
    val total: Int,
    val content: List<T>
)
