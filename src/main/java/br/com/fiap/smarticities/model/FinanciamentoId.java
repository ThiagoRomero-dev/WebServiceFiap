package br.com.fiap.smarticities.model;

import java.io.Serializable;
import java.util.Objects;

public class FinanciamentoId implements Serializable {
    private int id;
    private int parceiro;

    public FinanciamentoId(int id, int parceiro) {
        this.id = id;
        this.parceiro = parceiro;
    }

    public FinanciamentoId(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParceiro() {
        return parceiro;
    }

    public void setParceiro(int parceiro) {
        this.parceiro = parceiro;
    }

    @Override
    public  int hashCode(){
        return Objects.hash(id,parceiro);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        FinanciamentoId other = (FinanciamentoId) obj;
        return id == other.id && parceiro == other.parceiro;
    }
}
