package dao;

import factory.ConnectionFactory;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class mae_encontroDAO {
    public void adicionarMaeAoEncontro(int idEncontro, int idMae) throws SQLException {
        
        String sql = "INSERT INTO maes_encontro (id_mae, id_encontro) VALUES (?, ?) " +
                     "ON DUPLICATE KEY UPDATE mae_id = mae_id"; 
        
        try (Connection conn = new ConnectionFactory().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, idEncontro);
            stmt.setInt(2, idMae);
            stmt.executeUpdate();
        }
    }
    
}
