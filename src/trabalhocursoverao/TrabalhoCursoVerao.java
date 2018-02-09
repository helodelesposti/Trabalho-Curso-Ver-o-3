/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocursoverao;

import Presenter.presenterLogin;
import java.util.ArrayList;
import java.util.List;
import model.Bebida;
import model.Cliente;
import model.Comida;
import model.Funcionario;
import model.Pedido;
import model.Seed;

public class TrabalhoCursoVerao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        presenterLogin pl = new presenterLogin(); 

        List clientes = Seed.getClientes();
        List bebidas = Seed.getBebidas();
        List comidas = Seed.getComidas();
        List funcionarios = Seed.getFuncionarios();
        List pedidos = Seed.getPedidos();

        clientes.forEach(System.out::println);
        System.out.println("");
        bebidas.forEach(System.out::println);
        System.out.println("");
        comidas.forEach(System.out::println);
        System.out.println("");
        funcionarios.forEach(System.out::println);
        System.out.println("");
        pedidos.forEach(System.out::println);
        System.out.println("");
        
      
    }

   
}
