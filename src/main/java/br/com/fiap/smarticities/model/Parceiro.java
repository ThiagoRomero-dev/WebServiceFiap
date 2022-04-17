package br.com.fiap.smarticities.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@SequenceGenerator(name = "parceiro", sequenceName = "SQ_PARCEIRO", allocationSize = 1)
@Table(name = "T_SIP_PARCEIRO")
public class Parceiro {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_parceiro")
    private int id;

    @NotBlank(message = "Nome obrigatório!")
    @Size(max = 70)
    @Column(name = "nm_parceiro")
    private String nome;

    @Past
    @NotNull(message = "Data Parceiro obrigatório!")
    @Column(name = "dt_celebracao_parceiro")
    private Date dataParceiro;

    @Column(name = "dt_fim_parceiro")
    private Date dataFimParceiro;

    public Parceiro(int id, String nome, Date dataParceiro, Date dataFimParceiro) {
        this.id = id;
        this.nome = nome;
        this.dataParceiro = dataParceiro;
        this.dataFimParceiro = dataFimParceiro;
    }

    public Parceiro() {
        super();
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

    public Date getDataParceiro() {
        return dataParceiro;
    }

    public void setDataParceiro(Date dataParceiro) {
        this.dataParceiro = dataParceiro;
    }

    public Date getDataFimParceiro() {
        return dataFimParceiro;
    }

    public void setDataFimParceiro(Date dataFimParceiro) {
        this.dataFimParceiro = dataFimParceiro;
    }
}
