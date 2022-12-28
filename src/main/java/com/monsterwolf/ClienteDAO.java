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
            System.out.println("\n Cliente no banco de dados");
                           
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
                System.out.println("Dados do banco: "+n+" "+i);
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso\nDados do banco:\nid: " + i + "\nNome: " + n );
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
    }
    public void verificarLogin(Login telaAtual, String email, String senha){
        try {
            PreparedStatement ps = conexao.prepareStatement("select * from cliente where email= ? and senha= ?");
            ps.setString(1, email);
            ps.setString(2, senha);

            ResultSet rst = ps.executeQuery();
            if (rst.next()) {
                new Loja().setVisible(true);
                telaAtual.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, digite as informações corretas...");
            }
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
    }
}