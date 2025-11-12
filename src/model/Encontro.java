package model;

import model.enums.Status;
import java.util.Date;

public class Encontro {
    
    private int idEncontro;
    private String nome;
    private String descricao;
    private Status status;
    private Date data;
    private int idMaeResponsavel;
    
    public int getId(){
        return idEncontro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public int getIdMae(){
        return idMaeResponsavel;
    }
    
    public void setIdMae(int id){
        this.idMaeResponsavel = id;
    }
    
}
