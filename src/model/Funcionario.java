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
public class Funcionario extends Pessoa implements Autenticar{
    private String login;
    private String senha;
    private String funcaoExercida;
    private String comissaoEntregador;
    private double salario;
    
    
    
    
    public Funcionario(String login, String senha, String funcaoExercida, String comissaoEntregador, double salario, String nome) {
        super(nome);
        this.login = login;
        this.senha = senha;
        this.funcaoExercida = funcaoExercida;
        this.comissaoEntregador = comissaoEntregador;
        this.salario = salario;
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String login, String nome) {
        super(nome);
        this.login = login;
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login.equals(""))
            System.out.println("Login vazio");
        else
            this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.equals(""))
            System.out.println("Senha vazia");
        else
            this.senha = senha;
    }

    public String getFuncaoExercida() {
        return funcaoExercida;
    }

    public void setFuncaoExercida(String funcaoExercida) {
        if (funcaoExercida.equals(""))
            System.out.println("Função exercida vazia");
        else
            this.funcaoExercida = funcaoExercida;
    }

    public String getComissaoEntregador() {
        return comissaoEntregador;
    }

    public void setComissaoEntregador(String comissaoEntregador) {
        if (comissaoEntregador.equals(""))
            System.out.println("Comissão entregador vazio");
            else
        this.comissaoEntregador = comissaoEntregador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0)
            System.out.println("Salário invalido");
        else
            this.salario = salario;
    }

    @Override
    public void alterarNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void autenticarFuncionario(String login, String senha) {
         
    }

    @Override
    public String toString() {
        return "Funcionario{" + "login=" + login + ", senha=" + senha + ", funcaoExercida=" + funcaoExercida + ", comissaoEntregador=" + comissaoEntregador + ", salario=" + salario + '}';
    }
    
    
}
    
       
    

