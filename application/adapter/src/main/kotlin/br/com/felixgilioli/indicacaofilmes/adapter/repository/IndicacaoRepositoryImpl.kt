package br.com.felixgilioli.indicacaofilmes.adapter.repository

import br.com.felixgilioli.indicacaofilmes.port.model.Indicacao
import br.com.felixgilioli.indicacaofilmes.port.model.Pagina
import br.com.felixgilioli.indicacaofilmes.port.model.PaginaRequest
import br.com.felixgilioli.indicacaofilmes.port.model.TipoIndicacao
import br.com.felixgilioli.indicacaofilmes.port.output.PersisteIndicacaoPort
import br.com.felixgilioli.indicacaofilmes.port.output.RecuperarIndicacoesPaginadasPort
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class IndicacaoRepositoryImpl(private val jdbcTemplate: JdbcTemplate) : PersisteIndicacaoPort,
    RecuperarIndicacoesPaginadasPort {

    override fun persist(indicacao: Indicacao) {
        jdbcTemplate.update("INSERT INTO indicacao_filmes.indicacao(nome, ano, tipo, usuario) VALUES(?, ?, ?, ?)",
            indicacao.nome,
            indicacao.ano,
            indicacao.tipo.name,
            indicacao.usuario)
    }

    override fun recuperar(paginaRequest: PaginaRequest): Pagina<Indicacao> {
        val rowMapper = RowMapper { resultSet: ResultSet, _: Int ->
            Indicacao(
                nome = resultSet.getString("nome"),
                ano = resultSet.getInt("ano"),
                tipo = TipoIndicacao.valueOf(resultSet.getString("tipo")),
                usuario = resultSet.getString("usuario")
            )
        }

        val indicacoes = jdbcTemplate.query(
            "SELECT nome, ano, tipo, usuario FROM indicacao_filmes.indicacao OFFSET ? LIMIT ?", rowMapper,
            paginaRequest.pagina * paginaRequest.tamanho,
            paginaRequest.tamanho
        )

        return Pagina(buscarTotalDeIndicacoes(), indicacoes)
    }

    private fun buscarTotalDeIndicacoes(): Int {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM indicacao_filmes.indicacao", Int::class.java)
    }
}