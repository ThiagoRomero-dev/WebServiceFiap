package br.com.fiap.smarticities.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "contrato",sequenceName = "sq_contrato", allocationSize = 1)
@Table(name = "T_SIP_CONTRATO")
public class Contrato {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_contrato")
    private int id;

    @NotBlank(message = "Vinculo empregaticio obrigatório!")
    @Size(max = 50)
    @Column(name = "nm_vinculo_empregaticio")
    private String vinculoEmpregaticio;

    @NotBlank(message = "Função obrigatória!")
    @Size(max = 50)
    @Column(name = "nm_funcao")
    private String funcao;

    @Column(name = "ds_funcao")
    private String descricao_funcao;

    public Contrato(int id, String vinculoEmpregaticio, String funcao, String descricao_funcao) {
        super();
        this.id = id;
        this.vinculoEmpregaticio = vinculoEmpregaticio;
        this.funcao = funcao;
        this.descricao_funcao = descricao_funcao;
    }

    public Contrato() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVinculoEmpregaticio() {
        return vinculoEmpregaticio;
    }

    public void setVinculoEmpregaticio(String vinculoEmpregaticio) {
        this.vinculoEmpregaticio = vinculoEmpregaticio;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDescricao_funcao() {
        return descricao_funcao;
    }

    public void setDescricao_funcao(String descricao_funcao) {
        this.descricao_funcao = descricao_funcao;
    }
}
