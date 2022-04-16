package br.com.fiap.smarticities.repository;

import br.com.fiap.smarticities.model.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ParceiroRepository extends JpaRepository<Parceiro,Integer> {
    List<Parceiro> findByNome(String parc);
    List<Parceiro> findByDataParceiro(Date dataParc);
    List<Parceiro> findByDataFimParceiro(Date dataFim);
}
