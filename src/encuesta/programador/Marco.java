/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta.programador;

import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12-sep-2021
 *
 */
public class Marco extends JFrame {

    public Marco() {

        setVisible(true);
        setBounds(500, 300, 400,550);
        setTitle("Programadores X");
        Lamina lamina=new Lamina();
        add(lamina);
    }
}
