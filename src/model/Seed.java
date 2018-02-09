/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class Seed {

    private static List clientes;
    private static List bebidas;
    private static List comidas;
    private static List funcionarios;
    private static List pedidos;

    public Seed() {
       
        
        
        
        
    }
    public static ArrayList<Cliente> getClientes(){
        clientes = new ArrayList<Cliente>();
        clientes.add( new Cliente("rua a","1","1231","123123",1,"Cassio"));
        clientes.add( new Cliente("rua b","12","12312","1231234",2,"Caio"));
        clientes.add( new Cliente("rua c","123","123123","12312345",3,"Carlos"));
        clientes.add( new Cliente("rua d","1234","1231234","123123456",4,"Caique"));
        clientes.add( new Cliente("rua e","12345","12312345","123123456",5,"Cassiano"));
        return (ArrayList<Cliente>) clientes;
    }
    public static ArrayList<Bebida> getBebidas(){
        bebidas = new ArrayList<Bebida>();
        bebidas.add( new Bebida("Sim","Vinho","50,00"));
        bebidas.add( new Bebida("Sim","Coca Cola","10,00"));
        bebidas.add( new Bebida("Sim","Fanta Uva","10,00"));
        bebidas.add( new Bebida("Sim","Guarana","10,00"));
        bebidas.add( new Bebida("Sim","Agua","2,00"));
        return (ArrayList<Bebida>) bebidas;
    }
    public static ArrayList<Comida> getComidas(){
        comidas = new ArrayList<Comida>();
        comidas.add( new Comida("sim","Portuguesa","60,00"));
        comidas.add( new Comida("Sim","Calabresa","60,00"));
        comidas.add( new Comida("Sim","Lombinho","60,00"));
        comidas.add( new Comida("Sim","Frango","60,00"));
        comidas.add( new Comida("Sim","Vegana","60,00"));
        return (ArrayList<Comida>) comidas;
    }
    public static ArrayList<Funcionario> getFuncionarios(){
        funcionarios = new ArrayList<Funcionario>();
        funcionarios.add( new Funcionario("Usuario01","123121"));
        funcionarios.add( new Funcionario("Usuario02","123122"));
        funcionarios.add( new Funcionario("Usuario03","123123"));
        funcionarios.add( new Funcionario("Usuario04","123124"));
        funcionarios.add( new Funcionario("Usuario05","123125"));
        
        return (ArrayList<Funcionario>) funcionarios;
    }
    public static ArrayList<Pedido> getPedidos(){
        pedidos = new ArrayList<Pedido>();
        pedidos.add( new Pedido(100.00,"Em andamento","10/01/2018"));
        pedidos.add( new Pedido(70.00,"Em andamento","10/01/2018"));
        pedidos.add( new Pedido(160.00,"Em andamento","10/01/2018"));
        pedidos.add( new Pedido(60.00,"Em andamento","10/01/2018"));
        pedidos.add( new Pedido(102.00,"Em andamento","10/01/2018"));
        
        
        return (ArrayList<Pedido>) pedidos;
    }
}
