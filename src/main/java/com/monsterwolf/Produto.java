package com.monsterwolf;

public class Produto { 	 
    private String nome;
    private int quantidade;
    private String valor;
    private String descricao; 	 	

    public Produto(String nome, String descricao, int quantidade, String valor){ 
        
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    } 	
    //Getters e Setters 	

    public String getNome() { 
        return nome; 	
    } 	
    public void setNome(String nome) {
        this.nome = nome; 	
    }	
    public String getDescricao() { 
        return descricao; 	
    } 	

    public void setDescricao(String descricao) {
        this.descricao = descricao; 
    } 
    public int getQuantidade() { 
        return quantidade; 	
    } 	

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade; 
    } 
    public String getValor() { 
        return valor; 	
    } 	

    public void setValor(String valor) {
        this.valor = valor; 
    }

}