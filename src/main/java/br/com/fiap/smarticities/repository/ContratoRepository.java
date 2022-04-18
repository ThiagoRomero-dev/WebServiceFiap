package br.com.fiap.smarticities.repository;

import br.com.fiap.smarticities.model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato,Integer> {
    List<Contrato> findByVinculoEmpregaticio(String cont);
    List<Contrato> findByFuncao(String nomeFuncao);
}
