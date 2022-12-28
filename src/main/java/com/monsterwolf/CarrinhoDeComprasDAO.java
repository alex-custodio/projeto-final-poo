package com.monsterwolf;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CarrinhoDeComprasDAO {
    private static int id = 0;
    private static ArrayList<Produto> lista_desejos = new ArrayList();
    Connection conexao;

    public CarrinhoDeComprasDAO(){
        conexao = new Conexao().getConexao();        
    }
    
    public void inserirProduto(Produto produto){
        try{
            id++;
            PreparedStatement ps = conexao.prepareStatement("insert into carrinho (id, produto, preco, quantidade) values (?, ?, ?, ?)");
            ps.setInt(1, this.id);
            ps.setString(2, produto.getNome());
            ps.setString(3, produto.getValor());
            ps.setInt(4, produto.getQuantidade());
            ps.executeUpdate();            
            System.out.println("\n Venda feita com sucesso");
            lista_desejos.add(produto); 
            JOptionPane.showMessageDialog(null, "Produto adicionado ao seu carrinho de compras!");
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    public void consultarTudo(){
        String sql="select * from carrinho;";
        try {
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){

                String n = rst.getString("produto");
                String v = rst.getString("preco");
                int i = rst.getInt("id");
                int q = rst.getInt("quantidade");
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso\nDados do banco:\nid: " + i + "\nNome: " + n + "\nValor: " + v + "\nQuantidade: " + q);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de: "+ex);
        }
    }
    
    public ArrayList<Produto> getListaDesejos(){
        return lista_desejos;
    }
    public void editarProduto(Produto produto, int id){
        try {
            PreparedStatement ps = conexao.prepareStatement("update carrinho set produto = ? , preco = ? , quantidade = ? where id = ?");
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getValor());
            ps.setInt(3, produto.getQuantidade());
            ps.setInt(4,this.id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado!");
            lista_desejos.set(id, produto);
        } catch (Exception e) {
            System.out.println("Erro causado por: " + e);
        }
    }
    // Esse método irá apagar um produto na tabela carrinho através de um índice.
    public void apagarProduto(int id){
        try{
            PreparedStatement ps =conexao.prepareStatement("delete from carrinho where id = ?");
            ps.setInt(1,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Apagado!");
            lista_desejos.remove(id);
        }catch(Exception e){
            System.out.println("Erro causado por: " + e);

        }
        
    }
    
}