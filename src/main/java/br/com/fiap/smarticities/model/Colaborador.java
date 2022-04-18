package br.com.fiap.smarticities.model;


import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.hibernate.annotations.GenericGenerator;


@Entity
@SequenceGenerator(name = "colaborador", sequenceName = "sq_colaborador", allocationSize = 1)
@Table(name = "T_SIP_COLABORADOR")
public class Colaborador {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_colaborador")
    private int id;

    @NotNull(message = "Estabelecimento obrigatorio!")
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_estabelecimento")
    private Estabelecimento estabelecimento;

    @NotNull(message = "Departamento obrigatorio!")
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;

    @NotNull(message = "Contrato obrigatorio!")
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_contratro")
    private Contrato contrato;

    @Column(name = "nm_colaborador")
    private String nome;

    @Temporal(TemporalType.DATE)
    @NotNull(message = "Data de admissão obrigatoria!")
    @Column(name = "dt_admissao")
    private Date dataAdmissao;

    @NotNull(message = "Endereco do colaborador obrigatorio!")
    @Size(max = 80)
    @Column(name = "ds_endereco")
    private String endereco;

    @NotNull(message = "Salario do colaborador obrigatorio!")
    @Column(name = "vl_salario")
    private float salario;


    public Colaborador() {
        super();
    }



    public Colaborador(int id, Estabelecimento estabelecimento, Departamento departamento, Contrato contrato, String nome, Date dataAdmissao, String endereco, float salario) {
        this.id = id;
        this.estabelecimento = estabelecimento;
        this.departamento = departamento;
        this.contrato = contrato;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.endereco = endereco;
        this.salario = salario;
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estabelecimento getEstabelecimento() {
        return this.estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Contrato getContrato() {
        return this.contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
