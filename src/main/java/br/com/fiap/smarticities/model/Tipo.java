package br.com.fiap.smarticities.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "tipo", sequenceName = "sq_tipo", allocationSize = 1)
@Table(name = "T_SIP_TIPO")
public class Tipo {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_acao_social")
    private int id;

    @NotBlank(message = "Tipo ação social é obrigatório!")
    @Size(max = 50)
    @Column(name = "nm_tp_acao_social")
    private String tipoAcaoSocial;

    @Column(name = "ds_acao_social")
    private String desc_acao_social;

    public Tipo(int id, String tipoAcaoSocial, String desc_acao_social) {
        super();
        this.id = id;
        this.tipoAcaoSocial = tipoAcaoSocial;
        this.desc_acao_social = desc_acao_social;
    }

    public Tipo() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoAcaoSocial() {
        return tipoAcaoSocial;
    }

    public void setTipoAcaoSocial(String tipoAcaoSocial) {
        this.tipoAcaoSocial = tipoAcaoSocial;
    }

    public String getDesc_acao_social() {
        return desc_acao_social;
    }

    public void setDesc_acao_social(String desc_acao_social) {
        this.desc_acao_social = desc_acao_social;
    }


}