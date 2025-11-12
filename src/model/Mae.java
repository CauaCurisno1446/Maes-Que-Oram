package model;

import java.util.Date;

public class Mae {

    private int idMae;
    private String nome;
    private String telefone;
    private String endereco;
    private Date dataNasc;

    
    public int getId(){
        return idMae;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getTel(){
        return this.telefone;
    }
    
    public String getEnd(){
        return this.endereco;
    }
    
    public Date getData(){
        return this.dataNasc;
    }
    
    public void setId(int id){
        this.idMae = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTel(String telefone){
        this.telefone = telefone;
    }
    
    public void setEnd(String endereco){
        this.endereco = endereco;
    }
    
    public void setData(Date dataNasc){
        this.dataNasc = dataNasc;
    }
    
    @Override
    public String toString() {
        if (this.nome == null) {
            return "[Mãe sem nome]"; 
        }
        return this.nome;
    }
}
