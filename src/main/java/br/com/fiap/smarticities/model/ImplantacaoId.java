package br.com.fiap.smarticities.model;

import java.io.Serializable;
import java.util.Objects;

public class ImplantacaoId implements Serializable {
    private int id;
    private int projeto;

    public ImplantacaoId(int id, int projeto) {
        this.id = id;
        this.projeto = projeto;
    }

    public ImplantacaoId(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjeto() {
        return projeto;
    }

    public void setProjeto(int projeto) {
        this.projeto = projeto;
    }

    @Override
    public  int hashCode(){
        return Objects.hash(id,projeto);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        ImplantacaoId other = (ImplantacaoId) obj;
        return id == other.id && projeto == other.projeto;
    }
}
