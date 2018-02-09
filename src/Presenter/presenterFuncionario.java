/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import View.CadastrarFuncionario;
import View.telaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Heloiza
 */
public class presenterFuncionario {
    private CadastrarFuncionario cadFuncionario; 

    public presenterFuncionario() {
        
        manterTela();   
    }

    private void manterTela() {
        
        cadFuncionario = new CadastrarFuncionario ();
        cadFuncionario.setVisible (true);
    
       /* cadFuncionario.getjButtonSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventoBotSalvar();
            }
            });*/
        
        cadFuncionario.getjButtonSairFunc().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventoBotSairFunc();
            }           
            
        });       
        
    }
        private void eventoBotSairFunc()  {
               cadFuncionario.dispose();
            }
        
        /*private void eventoBotSalvar(){
            
            String nome, usuario;
            nome = cadFuncionario.getTxtNomeFuncionario().getText();
            usuario= cadFuncionario.getTxtUser().getText();
            
            System.out.print(nome + usuario);
            
             
            if (null == nome || usuario == null) {

              JOptionPane.showMessageDialog(cadFuncionario, "Campo Obrigatorio Não preenchido");
             
             }
            else {

            JOptionPane.showMessageDialog(cadFuncionario, "Funcionario Cadastrado");
        }
}*/
}