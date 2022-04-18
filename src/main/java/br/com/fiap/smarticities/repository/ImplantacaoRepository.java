package br.com.fiap.smarticities.repository;

import br.com.fiap.smarticities.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ImplantacaoRepository extends JpaRepository<Implantacao, ImplantacaoId> {
    List<Implantacao> findByProjeto(Projeto projeto);
    List<Implantacao> findByColaborador(Colaborador colaborador);
    List<Implantacao> findByDataEntrada(Date dataEntrada);
}
