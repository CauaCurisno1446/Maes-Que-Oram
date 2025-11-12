package model;

import model.enums.Status;
import java.util.Date;

public class Encontro {
    
    private int idEncontro;
    private Status status;
    private Date data;
    
    public int getId(){
        return idEncontro;
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
}
