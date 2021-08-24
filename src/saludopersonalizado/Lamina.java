/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludopersonalizado;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 17/08/2021
 *
 */
public class Lamina extends JPanel {

    private Box caja;
    private JLabel texto;
    private JTextField campo;
    private JButton boton;

    public Lamina() {
        setLayout(new BorderLayout());
        caja = Box.createVerticalBox();
        
        texto=new JLabel("Escribe un nombre para saludar!");
        caja.add(texto);
        campo=new JTextField(10);
        caja.add(campo);
        boton=new JButton("¡Saludar!");
        boton.addActionListener(new MensajeSaludo());
        caja.add(boton);
        add(caja,BorderLayout.CENTER);
    }
    
    private class MensajeSaludo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==boton && campo.getText().length()>0){
                JOptionPane.showMessageDialog(caja, "¡Hola "+campo.getText()+"!",":)", 1);
            }
        }
    
    }

}
