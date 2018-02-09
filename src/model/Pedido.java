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
public class Pedido {
    private double valor;
    private String status;
    private String data;
    private static int numeroTotalPedidos;

    public Pedido(double valor, String status, String data) {
        this.valor = valor;
        this.status = status;
        this.data = data;
        
    }

    public static int getNumerodePedidos(){
        return numeroTotalPedidos;
    }
        
    
    public Pedido() {
    }

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0)
            System.out.println("Valor vazio");
        else
            this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals(""))
            System.out.println("Status vazio");
        else
            this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data.equals(""))
            System.out.println("Data vazia");
        else
            this.data = data;
    }

    public static int getNumeroTotalPedidos() {
        return numeroTotalPedidos;
    }

    public static void setNumeroTotalPedidos(int numeroTotalPedidos) {
        if (numeroTotalPedidos <= 0)
            System.out.println("Número de pedidos inválido");
        else
            Pedido.numeroTotalPedidos = numeroTotalPedidos;
    }

    @Override
    public String toString() {
        return "Pedido{" + "valor=" + valor + ", status=" + status + ", data=" + data + '}';
    }
    
    
    
}
