/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropeliculas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 30/08/2021
 *
 */
public class miMarco extends JFrame {

    public miMarco() {
        setVisible(true);
        setResizable(false);
        setBounds(500, 300, 500, 600);
        setTitle("Registro Peliculas");
        LaminaPeliculas lamina = new LaminaPeliculas();
        lamina.setBackground(new Color(10, 15, 20));
        add(lamina);

    }
}
