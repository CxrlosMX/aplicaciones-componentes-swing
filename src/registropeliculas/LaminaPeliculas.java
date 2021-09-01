/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropeliculas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

    //Componentes que iran en el centro de la aplicacion
    private JPanel laminaCentro;
    private JLabel nombrePelicula;
    private JTextField campoNombre;

    //Centro
    private JLabel textoGenero;
    private JComboBox comboGenero;

    public LaminaPeliculas() {
        //Laminas uso
        laminaMensaje = new JPanel();
        //Definimos el Layout 
        setLayout(new BorderLayout());

        //Lamina que muestra el mensaje
        this.dameJLabel("BreakersSlab-Black", 30, Font.BOLD, mensaje, "REGISTRO PELICULAS", laminaMensaje, new Color(10, 80, 122), new Color(56, 200, 150));

        //--------------------------------------------------------------------------------
        /*
         Parte central 
         */
        laminaCentro = new JPanel();
        laminaCentro.setLayout(new EnColumna()); //Especificamos el tipo de layout que va a tener nuestra lamina
        this.dameJLabel("Serif", 15, Font.ITALIC, nombrePelicula, "PELICULA: ", laminaCentro, null, Color.white);
        campoNombre = new JTextField(8);
        laminaCentro.add(campoNombre);
        //Combobox--------------------------------------------------------------------------------
        this.dameJLabel("Serif", 15, Font.ITALIC, textoGenero, "GENERO: ", laminaCentro, null, Color.white);
        comboGenero = new JComboBox();
        comboGenero.addItem("Acción");
        comboGenero.addItem("Comedia");
        comboGenero.addItem("Terror");
        comboGenero.addItem("Aventuras");
        laminaCentro.add(comboGenero);
        //--------------------------------------------------------------------------------
        //Agregamos nuestras laminas a nuestro JPanel principal
        add(laminaMensaje, BorderLayout.NORTH);
        add(laminaCentro, BorderLayout.CENTER);
    }
    //

    /*
     Método que colocara un JLabel personalizado
     */
    private JLabel dameJLabel(String tipografia, int tamagno, int estiliLetra, JLabel i, String mensaje, JPanel lamina, Color colorLamina, Color colorTexto) {
        i = new JLabel(mensaje);
        i.setFont(new Font(tipografia, estiliLetra, tamagno));
        i.setForeground(colorTexto);
        lamina.setBackground(colorLamina);
        lamina.add(i);
        return i;
    }

    //Método que nos devuelbe un mensaje personalizado
    private void mensajeTexto(String tipografia, int tamagno, int estiliLetra, JLabel i) {
        i.setFont(new Font(tipografia, estiliLetra, tamagno));

    }
}
