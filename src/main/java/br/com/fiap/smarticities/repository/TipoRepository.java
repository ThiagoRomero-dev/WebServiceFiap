package br.com.fiap.smarticities.repository;


import br.com.fiap.smarticities.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoRepository extends JpaRepository<Tipo,Integer> {
    List<Tipo> findByTipoAcaoSocial(String tipo);
}
