/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import View.cadastroCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Heloiza
 */
public class presenterCliente {
    
    private cadastroCliente cadCliente;

    public presenterCliente() {
        manterTela ();
        
    }  

    private void manterTela() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     cadCliente = new cadastroCliente();
     cadCliente.setVisible(true);
     
     cadCliente.getjButtonVoltarCliente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadCliente.dispose();
            }
            
        });         
     
    }
    
    
}
