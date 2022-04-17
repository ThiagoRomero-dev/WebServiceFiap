package br.com.fiap.smarticities.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@SequenceGenerator(name = "financiamento", sequenceName = "SQ_FINANCIAMENTO", allocationSize = 1)
@Table(name = "T_SIP_FINANCIAMENTO")
@IdClass(FinanciamentoId.class)
public class Financiamento {

    @Id
    @GeneratedValue(generator = "financiamento", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_financiamento")
    private int id;

    @Id
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_parceiro")
    private Parceiro parceiro;

    @NotNull(message = "Estabelecimento obrigatório!")
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_estabelecimento")
    private Estabelecimento estabelecimento;

    @NotBlank(message = "Tipo Financiamento obrigatório!")
    @Size(max = 50)
    @Column(name="ds_tp_financiamento")
    private String descricaoTipoFinanciamento;

    @NotNull(message = "Data contratação obrigatória!")
    @Temporal(TemporalType.DATE)
    @Column(name = "dt_contratacao")
    private Date dataContratacao;

    @NotNull(message = "Valor investimento obrigatório!")
    @Column(name = "vl_investimento")
    private float valorInvestimento;

    public Financiamento(int id, Parceiro parceiro, String descricaoTipoFinanciamento, Date dataContratacao, float valorInvestimento) {
        this.id = id;
        this.parceiro = parceiro;
        this.descricaoTipoFinanciamento = descricaoTipoFinanciamento;
        this.dataContratacao = dataContratacao;
        this.valorInvestimento = valorInvestimento;
    }

    public Financiamento() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getDescricaoTipoFinanciamento() {
        return descricaoTipoFinanciamento;
    }

    public void setDescricaoTipoFinanciamento(String descricaoTipoFinanciamento) {
        this.descricaoTipoFinanciamento = descricaoTipoFinanciamento;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public float getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(float valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }
}
