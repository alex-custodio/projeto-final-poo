package com.monsterwolf;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

// Aqui está a classeDAO referente a tabela de carrinho de compras no mysql, é aqui que serão feitas todas as comunicações
// com o banco de dados do carrinho de compras, que é a parte mais completa do projeto
public class CarrinhoDeComprasDAO {
    private static int id = 0;
    static ArrayList<Produto> lista_desejos;
    Connection conexao;

    public CarrinhoDeComprasDAO(){
        conexao = new Conexao().getConexao();        
    }
    
    public void inserirProduto(Produto produto){
        try{
            id++;
            PreparedStatement ps = conexao.prepareStatement("insert into carrinho (produto, preco, quantidade) values (?, ?, ?)");
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getValor());
            ps.setInt(3, produto.getQuantidade());
            ps.executeUpdate();            
            System.out.println("\nsucesso");
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
    //A ideia aqui é gerar um array list baseado nos dados existentes na tabela
    public ArrayList<Produto> getListaDesejos(){
        lista_desejos = new ArrayList();
        try {
            PreparedStatement sttmt = conexao.prepareStatement("select * from carrinho");
            ResultSet consulta = sttmt.executeQuery();
            while (consulta.next()) {
                Produto pd = new Produto(consulta.getString("produto"), "", consulta.getInt("quantidade"), consulta.getString("preco"));
                pd.setId(consulta.getInt("id"));
                lista_desejos.add(pd);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        return lista_desejos;
    }
    //Quando o cliente comprar todos os itens do carrinho, é interessante que a lista se esvazie, por isso esse método foi criado
    // garantindo que na classe Carrinho seja possível esvaziar essa lista.
    public void setListaDesejos(ArrayList l){
        this.lista_desejos = l;
    }
    
    public void editarProduto(Produto produto, int id){
        try {
            PreparedStatement ps = conexao.prepareStatement("update carrinho set produto = ? , preco = ? , quantidade = ? where id = ?");
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getValor());
            ps.setInt(3, produto.getQuantidade());
            ps.setInt(4, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado!");
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
            
        }catch(Exception e){
            System.out.println("Erro causado por: " + e);

        }
        
    }
    
}