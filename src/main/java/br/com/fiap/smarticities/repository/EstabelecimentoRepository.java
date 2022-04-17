package br.com.fiap.smarticities.repository;

import br.com.fiap.smarticities.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento,Integer> {
    List<Estabelecimento> findByNome(String estab);
    List<Estabelecimento> findByTipoEstabelecimento(String tipoEstabelecimento);
    List<Estabelecimento> findByDataCriacao(Date dataCriacao);
    List<Estabelecimento> findByValorPatrimonioSocial(float valorPatrimonioSocial);
}   
