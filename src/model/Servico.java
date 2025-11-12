package model;

public class Servico{
    
    private int id;
    private String nome;

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
    
    @Override
    public String toString() {
        if (this.nome == null) {
            return "[Serviço sem nome]"; 
        }
        return this.nome;
    }
}