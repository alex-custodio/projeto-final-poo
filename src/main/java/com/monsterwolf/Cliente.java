package com.monsterwolf;

public class Cliente { 
    private static int id = 0; 
    private String nome; 
    private String cpf;
    private String email; 
    private String senha;
    public Cliente(String nome, String cpf,  String email, String senha) { 
        id++;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email; 
        this.senha = senha;
    } 
    public void setId(int id){
        this.id = id;
    }
    public int getId() { 
        return id; 
    } 

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getNome() { 
        return nome; 
    } 

    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    } 

    public String getCpf() {
        return cpf; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }

    public String getEmail() {
        return email; 
    }
    public void setSenha(String senha) { 
        this.senha = senha; 
    }

    public String getSenha() {
        return senha; 
    }
}
