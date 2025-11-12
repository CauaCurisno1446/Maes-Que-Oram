package dao;

import factory.ConnectionFactory;
import model.Encontro;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class encontroDAO {
    
    private Connection connection;

    public encontroDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }

    public int addEncontro(Encontro encontro) throws SQLException{
        String sql = "INSERT INTO encontro(data_encontro) VALUES(?)";
        int idGerado = -1;
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                     
            java.sql.Date dataEnc = new java.sql.Date(encontro.getData().getTime());
            stmt.setDate(1, dataEnc);
            int linhas = stmt.executeUpdate();
            
            if(linhas > 0){
                try(ResultSet rs = stmt.getGeneratedKeys()){
                    if(rs.next()){
                        idGerado = rs.getInt(1);
                        System.out.println("ID GERADO:" + idGerado);
                    }
                }
            }

        } 
        
        catch (SQLException u) {
            System.err.println("Falha no encontroDAO.addEncontro:");
            u.printStackTrace();
            throw new SQLException("Erro ao adicionar encontro: " + u.getMessage(), u);
        }
        return idGerado;
    }
}
