package br.com.fiap.smarticities.repository;


import br.com.fiap.smarticities.model.Projeto;
import br.com.fiap.smarticities.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto,Integer> {
    List<Projeto> findByNome(String proj);
    List<Projeto> findByTipo(Tipo tipo);
    List<Projeto> findByDataInicio(Date dataInicio);
}
