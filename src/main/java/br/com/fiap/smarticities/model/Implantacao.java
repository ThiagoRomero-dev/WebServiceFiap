package br.com.fiap.smarticities.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@SequenceGenerator(name = "implantacao", sequenceName = "sq_implantacao", allocationSize = 1)
@Table(name = "T_SIP_IMPLANTACAO")
@IdClass(ImplantacaoId.class)
public class Implantacao{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_implantacao")
    private int id;

    @Id
    @NotNull(message = "Projeto obrigatório!")
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;

    @NotNull(message = "Colaborador obrigatório!")
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "id_colaborador")
    private Colaborador colaborador;

    @Temporal(TemporalType.DATE)
    @NotNull(message = "Data Entrada obrigatória!")
    @Column(name = "dt_entrada")
    private Date dataEntrada;

    @Column(name = "dt_saida")
    private Date dt_saida;

    public Implantacao(int id, Projeto projeto, Colaborador colaborador, Date dataEntrada, Date dt_saida) {
        super();
        this.id = id;
        this.projeto = projeto;
      //  this.colaborador = colaborador;
        this.dataEntrada = dataEntrada;
        this.dt_saida = dt_saida;
    }

    public Implantacao() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Colaborador getColaborador() {
        return colaborador;
   }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDt_saida() {
        return dt_saida;
    }

    public void setDt_saida(Date dt_saida) {
        this.dt_saida = dt_saida;
    }


}