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
        String sql = "INSERT INTO encontro(nome, descricao, data_encontro, id_mae_responsavel) VALUES(?, ?, ?, ?)";
        int idGerado = -1;
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, encontro.getNome());
            stmt.setString(2, encontro.getDescricao());
            
            
            java.sql.Date dataEnc = new java.sql.Date(encontro.getData().getTime());
            stmt.setDate(3, dataEnc);
            
            stmt.setString(4, Integer.toString(encontro.getIdMae()));

            int affectedRows = stmt.executeUpdate();

            // Se o INSERT funcionou...
            if (affectedRows > 0) {
                // ...pega o ID que o banco acabou de criar
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        idGerado = rs.getInt(1); // Pega o ID da primeira coluna
                    }
                }
            }
        } catch (SQLException u) {
            System.err.println("Falha no encontroDAO.addEncontro:");
            u.printStackTrace();
            throw new SQLException("Erro ao adicionar encontro: " + u.getMessage(), u);
        }
        
        // Retorna o ID do novo encontro (ou -1 se falhou)
        return idGerado; 
    }
    
}
