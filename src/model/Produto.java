/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Heloiza
 */
public abstract class Produto {
    
    protected String disponibilidade;
    protected String nome;
    protected String preco;

    public Produto(String disponibilidade, String nome, String preco) {
        this.disponibilidade = disponibilidade;
        this.nome = nome;
        this.preco = preco;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        if (disponibilidade.equals(""))
            System.out.println("Disponibilidade vazia");
        else
            this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.equals(""))
            System.out.println("Nome vazio");
        else
            this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        if (preco.equals(""))
            System.out.println("Preço vazio");
        else
            this.preco = preco;
    }
    
     public abstract void alterarNome(String nome);

    @Override
    public String toString() {
        return "Produto{" + "disponibilidade=" + disponibilidade + ", nome=" + nome + ", preco=" + preco + '}';
    }
     
}
