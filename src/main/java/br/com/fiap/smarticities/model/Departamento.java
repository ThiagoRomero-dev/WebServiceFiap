package br.com.fiap.smarticities.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "departamento", sequenceName = "sq_departamento", allocationSize = 1)
@Table(name = "T_SIP_DEPARTAMENTO")
public class Departamento {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_departamento")
    private int id;

    @NotBlank(message = "Nome departamento obrigatório!")
    @Size(max = 50)
    @Column(name = "nm_departamento")
    private String nome;

    public Departamento() {}

    public Departamento(int id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
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

}
