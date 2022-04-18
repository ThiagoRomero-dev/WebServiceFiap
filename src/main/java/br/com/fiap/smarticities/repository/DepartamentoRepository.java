package br.com.fiap.smarticities.repository;

import br.com.fiap.smarticities.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento,Integer> {
    List<Departamento> findByNome(String dep);

}
