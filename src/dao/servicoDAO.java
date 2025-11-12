package dao;

import factory.ConnectionFactory;
import model.Servico;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class servicoDAO {
    private Connection connection;
    
    public servicoDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public List<Servico> getTodosOsServicos() throws SQLException {
        
        String sql = "SELECT id_servico, nome FROM servico ORDER BY nome";
        
        List<Servico> listaDeServicos = new ArrayList<>();

        try (
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Servico servico = new Servico();
                servico.setId(rs.getInt("id_servico"));
                servico.setNome(rs.getString("nome"));
                
                
                listaDeServicos.add(servico);
            }
        } catch (SQLException e) {
            System.err.println("ERRO no DAO ao tentar buscar serviços:");
            e.printStackTrace();
            throw new SQLException("Erro ao buscar lista de serviços", e);
        }
        
        return listaDeServicos;
    }
    
}
