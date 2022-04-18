package br.com.fiap.smarticities.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@SequenceGenerator(name = "projeto", sequenceName = "sq_projeto", allocationSize = 1)
@Table(name = "T_SIP_PROJETO")
public class Projeto{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_projeto")
    private int id;

    @NotNull(message = "Tipo ação social obrigatória!")
    @ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name = "id_acao_social")
    private Tipo tipo;

    @NotBlank(message = "Nome obrigatório!")
    @Size(max = 50)
    @Column(name = "nm_projeto")
    private String nome;

    @Column(name = "ds_projeto")
    private String desc_projeto;

    @Temporal(TemporalType.DATE)
    @NotNull(message = "Data inicio obrigatória!")
    @Column(name = "dt_inicio")
    private Date dataInicio;

    @Column(name = "dt_termino")
    private Date dt_termino;

    public Projeto(int id, Tipo tipo, String nome, String desc_projeto, Date dataInicio, Date dt_termino) {
        super();
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.desc_projeto = desc_projeto;
        this.dataInicio = dataInicio;
        this.dt_termino = dt_termino;
    }

    public Projeto() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc_projeto() {
        return desc_projeto;
    }

    public void setDesc_projeto(String desc_projeto) {
        this.desc_projeto = desc_projeto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDt_termino() {
        return dt_termino;
    }

    public void setDt_termino(Date dt_termino) {
        this.dt_termino = dt_termino;
    }




}
