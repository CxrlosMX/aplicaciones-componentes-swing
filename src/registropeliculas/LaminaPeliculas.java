/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropeliculas;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 30/08/2021
 *
 */
public class LaminaPeliculas extends JPanel {
    /*
     Componentes 1
     */

    private JLabel mensaje;
    private JPanel laminaMensaje;

    public LaminaPeliculas() {
        //Laminas uso
        laminaMensaje = new JPanel();
        //Definimos el Layout 
        setLayout(new BorderLayout());

        //Lamina que muestra el mensaje
        mensaje = new JLabel("Peliculas");
        mensaje.setFont(new Font("Serif", Font.BOLD, 30));
        laminaMensaje.add(mensaje);
        /*
        Parte central 
        */
        
        
        //Agregamos nuestras laminas a nuestro JPanel principal
        add(laminaMensaje, BorderLayout.NORTH);
    }

    //Método que nos devuelbe un mensaje personalizado
    private void mensajeTexto(String tipografia, int tamagno, int estiliLetra, JLabel i) {
        i.setFont(new Font(tipografia, estiliLetra, tamagno));

    }
}
