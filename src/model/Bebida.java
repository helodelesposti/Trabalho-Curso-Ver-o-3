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
public class Bebida extends Produto {
    private String volume;

    public Bebida(String volume, String disponibilidade, String nome, String preco) {
        super(disponibilidade, nome, preco);
        this.volume = volume;
    }

    public Bebida(String disponibilidade, String nome, String preco) {
        super(disponibilidade, nome, preco);
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) throws Exception {
        if (volume.equals(""))
            throw new Exception("Volume vazio");
            //System.out.println("Volume vazio");
        else
            this.volume = volume;
    }

    @Override
    public void alterarNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Bebida{" + "volume=" + volume + '}';
    }
    
    
}
