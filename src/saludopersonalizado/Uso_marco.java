/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludopersonalizado;

import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 17/08/2021
 *
 */
public class Uso_marco {
    /*
     Crea un saludador personalizable. Consiste en un simple JFrame con un campo de texto (JTextField) y un botón (JButton). 
     Cuando pulsemos el botón, aparecerá un mensaje emergente (JOptionPane) con el texto “¡Hola <texto escrito en el campo de texto>!”.
     */

    public static void main(String[] args) {
       Marco marco=new Marco();
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
