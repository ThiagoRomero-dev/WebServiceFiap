package br.com.fiap.smarticities.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@SequenceGenerator(name = "estabelecimento", sequenceName = "SQ_ESTABELECIMENTO",allocationSize = 1)
@Table(name = "T_SIP_ESTABELECIMENTO")
public class Estabelecimento {

    @Id
    @GeneratedValue(generator = "estabelecimento",strategy = GenerationType.SEQUENCE)
    @Column(name = "id_estabelecimento")
    private int id;

    @NotBlank(message = "Nome estabelecimento obrigatório!")
    @Size(max = 50)
    @Column(name = "nm_estabelecimento")
    private String nome;

    @NotBlank(message = "Tipo estabelecimento obrigatório!")
    @Column(name = "ds_tp_estabelecimento")
    private String tipoEstabelecimento;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_criacao")
    private Date dataCriacao;

    @NotNull(message = "Valor Patrimonio Social obrigatório!")
    @Column(name = "vl_patromonio_social")
    private float valorPatrimonioSocial;

    public Estabelecimento(int id, String nome, String tipoEstabelecimento, Date dataCriacao, float valorPatrimonioSocial) {
        this.id = id;
        this.nome = nome;
        this.tipoEstabelecimento = tipoEstabelecimento;
        this.dataCriacao = dataCriacao;
        this.valorPatrimonioSocial = valorPatrimonioSocial;
    }

    public Estabelecimento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoEstabelecimento() {
        return tipoEstabelecimento;
    }

    public void setTipoEstabelecimento(String tipoEstabelecimento) {
        this.tipoEstabelecimento = tipoEstabelecimento;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public float getValorPatrimonioSocial() {
        return valorPatrimonioSocial;
    }

    public void setValorPatrimonioSocial(float valorPatrimonioSocial) {
        this.valorPatrimonioSocial = valorPatrimonioSocial;
    }
}
