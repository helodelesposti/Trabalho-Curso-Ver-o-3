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
public class Cliente extends Pessoa {
    private String endereco;
    private String telefone;
    private String cpf;
    private String rg;
    private int numerodePedidos;

    public Cliente(String endereco, String telefone, String cpf, String rg, int numerodePedidos, String nome) {
        super(nome);
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.numerodePedidos = numerodePedidos;
    }

    public Cliente(String nome) {
        super(nome);
    }

    public Cliente(String endereco, String nome) {
        super(nome);
        this.endereco = endereco;
    }
        
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.equals(""))
            System.out.println("Endereco vazio");
        else
            this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
            if (telefone.equals(""))
            System.out.println("Telefone vazio");
        else
            this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.equals(""))
            System.out.println("CPF vazio");
        else
            this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if (rg.equals(""))
            System.out.println("RG vazio");
        else
            this.rg = rg;
    }

    public int getNumerodePedidos() {
        return numerodePedidos;
    }

    public void setNumerodePedidos(int numerodePedidos) {
            if (numerodePedidos <= 0)
            System.out.println("Número de pedidos vazio");
        else
            this.numerodePedidos = numerodePedidos;
    }

    @Override
    public void alterarNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" + "endereco=" + endereco + ", telefone=" + telefone + ", cpf=" + cpf + ", rg=" + rg + ", numerodePedidos=" + numerodePedidos + '}';
    }
    
  
    }
    
