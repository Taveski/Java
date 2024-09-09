/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar.core.dao;

import br.edu.unicesumar.core.dao.conexao.ConexaoJDBC;
import br.edu.unicesumar.core.entity.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAO {

    public void inserir(Produto produto) {

        String sql = "INSERT INTO PRODUTO (NOME, VALOR_CUSTO, VALOR_VENDA, QUANTIDADE) VALUES (?,?,?,?)";

        PreparedStatement ps;

        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getValorCusto());
            ps.setDouble(3, produto.getValorVenda());
            ps.setInt(4, produto.getQtdEstoque());
            
            ps.execute();
            
        }catch(SQLException e){
            e.printStackTrace();            
        }
    }
    
    public Produto buscarProdutoPorId(Long id){
        
        String sql = "SELECT ID, NOME, VALOR_CUSTO, VALOR_VENDA, QUANTIDADE FROM PRODUTO WHERE ID = ?";
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            
            ps.setLong(1, id);
            
            rs = ps.executeQuery();
            
            Produto produto = new Produto();
            if(rs.next()){            
                produto.setId(rs.getLong("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setValorCusto(rs.getDouble("VALOR_CUSTO"));
                produto.setValorVenda(rs.getDouble("VALOR_VENDA"));
                produto.setQtdEstoque(rs.getInt("QUANTIDADE"));
            }
            
            return produto;
        }catch(SQLException e){
            
        }
        
        return null;
    }
}
