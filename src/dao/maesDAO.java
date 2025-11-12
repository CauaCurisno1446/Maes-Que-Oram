package dao;

import factory.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import model.Mae;

import java.sql.*;
import java.sql.PreparedStatement;


public class maesDAO {
    private Connection connection;

    public maesDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public List<Mae> getTodasAsMaes() throws SQLException {
        
        String sql = "SELECT id_mae, nome, telefone, endereco, dataNascimento FROM mae ORDER BY nome";
        
        List<Mae> listaDeMaes = new ArrayList<>();

        try (
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Mae mae = new Mae();
                
                mae.setId(rs.getInt("id_mae")); 
                
                mae.setNome(rs.getString("nome"));
                mae.setTel(rs.getString("telefone"));
                mae.setEnd(rs.getString("endereco"));
                mae.setData(rs.getDate("dataNascimento"));

                listaDeMaes.add(mae);
            }
        } catch (SQLException u) {
            throw new SQLException("Erro ao buscar lista de mães: " + u.getMessage(), u);
        }
        
        return listaDeMaes; 
    }

    public void addMae(Mae mae){
        String sql = "INSERT INTO mae(nome, telefone, endereco, dataNascimento) VALUES(?, ?, ?, ?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, mae.getNome());
            stmt.setString(2, mae.getTel());
            stmt.setString(3, mae.getEnd());
            
            java.sql.Date dataNasc = new java.sql.Date(mae.getData().getTime());
            stmt.setDate(4, dataNasc);
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u){
            throw new RuntimeException(u);
        }
    }
    
}
