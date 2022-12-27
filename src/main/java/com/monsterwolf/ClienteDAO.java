package com.monsterwolf;

import java.sql.*;
import javax.swing.JOptionPane;
        
public class ClienteDAO {
    Connection conexao;

    public ClienteDAO(){
        conexao = new Conexao().getConexao();        
    }
    
    public void inserirCliente(Cliente cl){
        try{
            PreparedStatement ps = conexao.prepareStatement("insert into  Cliente (id, nome, cpf, email, senha) values ( ?, ?, ?, ?, ?)");
            ps.setInt(1, cl.getId());
            ps.setString(2, cl.getNome());
            ps.setString(3, cl.getCpf());
            ps.setString(4, cl.getEmail());
            ps.setString(5, cl.getSenha());
            ps.executeUpdate();            
            System.out.println("\n Cliente inserida com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    public void consultarTudo(){
        String sql="select * from cliente;";
        try {
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String n = rst.getString("nome");
                int i = rst.getInt("id");
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso\nDados do banco:\nid: " + i + "\nNome: " + n);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
    }
}