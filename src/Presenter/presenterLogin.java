/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import View.loginTela;
import View.telaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author cassio
 */
public class presenterLogin {

    private loginTela telaLogin;

    public presenterLogin() {
    
        configurarTela();
            
    }
    
    private void configurarTela(){
    
        telaLogin = new loginTela();
        telaLogin.setVisible(true);
        
        telaLogin.getjButtonSair().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaLogin.dispose();
            }
            
        });
        
           telaLogin.getjButtonEntrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventoBotEntrar();
            }
            
        });
    }
    
    private void eventoBotEntrar(){
        
        String login, senha;
        login = telaLogin.getTxtLogin().getText();
        senha = telaLogin.getTxtSenha().getText();
        
        System.out.print(login +senha);
        
        
        if (login.equals("admin") && senha.equals("admin")) {

           JOptionPane.showMessageDialog(telaLogin, "Seja Bem vindo!");
           telaPrincipal info = new telaPrincipal();
           info.setLocationRelativeTo(null);
           info.setVisible(true);
           
           telaLogin.setVisible(false);
           telaLogin.dispose();

        
        } else {

            JOptionPane.showMessageDialog(telaLogin, "Acesso negado!", "Erro", 2);
        
    }
  }  
   
}
