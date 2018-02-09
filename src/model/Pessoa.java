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
public abstract class Pessoa {
    
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract void alterarNome(String nome);

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + '}';
    }
        
    
}