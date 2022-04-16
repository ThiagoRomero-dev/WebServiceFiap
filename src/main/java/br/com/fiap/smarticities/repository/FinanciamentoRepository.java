package br.com.fiap.smarticities.repository;

import br.com.fiap.smarticities.model.Estabelecimento;
import br.com.fiap.smarticities.model.Financiamento;
import br.com.fiap.smarticities.model.FinanciamentoId;
import br.com.fiap.smarticities.model.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FinanciamentoRepository extends JpaRepository<Financiamento, FinanciamentoId> {
    List<Financiamento> findByParceiro(Parceiro parceiro);
    //List<Financiamento> findByEstabelecimento(Estabelecimento estabelecimento);
    List<Financiamento> findByDataContratacao(Date dataContratacao);
    List<Financiamento> findByDescricaoTipoFinanciamento(String descricaoTipoFinanciamento);
}
