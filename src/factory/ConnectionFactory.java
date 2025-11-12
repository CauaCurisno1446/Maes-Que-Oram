package factory;

import java.sql.Connection; //conecta com o sql
import java.sql.DriverManager; //driver de conexão
import java.sql.SQLException; //tratamento de exceções


public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/maesqueoram", "root", "#Armani04");
        }
        catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    }
}
