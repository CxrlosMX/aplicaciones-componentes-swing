/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12/08/2021
 *
 */
public class miMarco extends JFrame {

    public miMarco() {
        setResizable(false);
        setVisible(true);
        setBounds(400, 150, 400, 400);
        setTitle("Registro Contactos");
        Lamina lamina = new Lamina();
        lamina.setBackground(new Color(13, 60, 90));
        add(lamina);
    }
}
