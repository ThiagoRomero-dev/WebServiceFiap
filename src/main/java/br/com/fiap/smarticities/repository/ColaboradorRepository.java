package br.com.fiap.smarticities.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.fiap.smarticities.model.Colaborador;
import br.com.fiap.smarticities.model.Contrato;
import br.com.fiap.smarticities.model.Departamento;
import br.com.fiap.smarticities.model.Estabelecimento;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador,Integer>{
    List<Colaborador> findByEstabelecimento(Estabelecimento estabelecimento);
    List<Colaborador> findByDepartamento(Departamento departamento);
    List<Colaborador> findByContrato(Contrato contrato);
    List<Colaborador> findByNome(String colab);
    List<Colaborador> findBydataAdmissao(Date dataAdmissao);
    List<Colaborador> findByEndereco(String endereco_colaborador);
    List<Colaborador> findBySalario(float salario_colaborador);
}
