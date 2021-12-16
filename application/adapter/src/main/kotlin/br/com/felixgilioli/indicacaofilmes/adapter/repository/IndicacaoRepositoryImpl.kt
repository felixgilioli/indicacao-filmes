package br.com.felixgilioli.indicacaofilmes.adapter.repository

import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import br.com.felixgilioli.indicacaofilmes.port.output.PersisteIndicacaoPort
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class IndicacaoRepositoryImpl(private val jdbcTemplate: JdbcTemplate) : PersisteIndicacaoPort {

    override fun persist(indicacao: Indicacao) {
        jdbcTemplate.update("INSERT INTO indicacao_filmes.indicacao(nome, ano, tipo, usuario) VALUES(?, ?, ?, ?)",
            indicacao.nome,
            indicacao.ano,
            indicacao.tipo.name,
            indicacao.usuario)
    }
}