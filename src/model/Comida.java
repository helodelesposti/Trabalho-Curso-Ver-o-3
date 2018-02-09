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
public class Comida extends Produto {
    private String igredientes;
    private String preparo;

    public Comida(String igredientes, String preparo, String disponibilidade, String nome, String preco) {
        super(disponibilidade, nome, preco);
        this.igredientes = igredientes;
        this.preparo = preparo;
    }

    public Comida(String disponibilidade, String nome, String preco) {
        super(disponibilidade, nome, preco);
    }

    public Comida(String igredientes, String disponibilidade, String nome, String preco) {
        super(disponibilidade, nome, preco);
        this.igredientes = igredientes;
    }
    
    
    
    public String getIgredientes() {
        return igredientes;
    }

    public void setIgredientes(String igredientes) {
        if (igredientes.equals(""))
            System.out.println("Igredientes vazio");
        else
            this.igredientes = igredientes;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setPreparo(String preparo) {
        if (preparo.equals(""))
            System.out.println("Preparo vazio");
        else
            this.preparo = preparo;
    }

    @Override
    public void alterarNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comida{" + "igredientes=" + igredientes + ", preparo=" + preparo + '}';
    }
    
    
    
}
