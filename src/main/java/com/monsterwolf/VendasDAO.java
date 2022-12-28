package com.monsterwolf;

import java.sql.*;
import javax.swing.JOptionPane;
        
public class VendasDAO {
    private static int id = 0;
    Connection conexao;

    public VendasDAO(){
        conexao = new Conexao().getConexao();        
    }
    
    public void inserirVenda(Produto vd){
        try{
            id++;
            PreparedStatement ps = conexao.prepareStatement("insert into  Vendas (id, nome_produto, valor, quantidade) values (?, ?, ?, ?)");
            ps.setInt(1, this.id);
            ps.setString(2, vd.getNome());
            ps.setString(3, vd.getValor());
            ps.setInt(4, vd.getQuantidade());
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Vendido!");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    public void consultarTudo(){
        String sql="select * from vendas;";
        try {
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){

                String n = rst.getString("nome_produto");
                String v = rst.getString("valor");
                int i = rst.getInt("id");
                int q = rst.getInt("quantidade");
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso\nDados do banco:\nid: " + i + "\nNome: " + n + "\nValor: " + v + "\nQuantidade: " + q);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
    }
    
    
}