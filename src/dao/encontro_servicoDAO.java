package dao;

import factory.ConnectionFactory;


import java.sql.*;
import java.sql.PreparedStatement;


public class encontro_servicoDAO {
    private Connection connection;

    public encontro_servicoDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionarServicoAoEncontro(int idEncontro, int idServico, int idMae) throws SQLException {
        String sql = "INSERT INTO encontro_servicos (id_encontro, id_servico) VALUES (?, ?)";
        
        try (
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idEncontro);
            stmt.setInt(2, idServico);

            stmt.executeUpdate();
        }
    }
}
