/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12/08/2021
 *
 */
public class Lamina extends JPanel {

    //Mensaje JLabel
    private JPanel lamina2, laminaCampo, laminaBotones;
    private JLabel mensaje;

    /*
     Areas de texto 
     */
    private JLabel nombre, localidad, numero;
    private JTextField campoNombre, campoLocalidad, campoNumero;
    /*
     Botones
     */
    private JButton agregar, mostrar;

    public Lamina() {
        setLayout(new BorderLayout());

        /*
         Mensaje "Agenda Contactos"
         */
        lamina2 = new JPanel();
        mensaje = new JLabel("AGENDA CONTACTOS");
        mensaje.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 25));
        mensaje.setForeground(Color.WHITE);
        lamina2.setBackground(new Color(13, 80, 90));
        lamina2.add(mensaje);

        /*
         Area de inserción
         */
        laminaCampo = new JPanel();
        laminaCampo.setLayout(new DispocisionPersonalizada());
        nombre = new JLabel("Nombre: ");
        localidad = new JLabel("Localidad: ");
        numero = new JLabel("Numero: ");
        //JText
        campoNombre = new JTextField(20);
        campoLocalidad = new JTextField(20);
        campoNumero = new JTextField(20);
        //Agregamos nuestros componentes a nuestra laminaCampo
        laminaCampo.add(nombre);
        laminaCampo.add(campoNombre);
        laminaCampo.add(localidad);
        laminaCampo.add(campoLocalidad);
        laminaCampo.add(numero);
        laminaCampo.add(campoNumero);

        /*
         Botones
         */
        laminaBotones = new JPanel();
        agregar = new JButton("Agregar");
        mostrar = new JButton("Mostrar");
        laminaBotones.add(agregar);
        laminaBotones.add(mostrar);
        //Componentes agregados a nuestra lamina
        add(lamina2, BorderLayout.NORTH);
        add(laminaCampo, BorderLayout.CENTER);
        add(laminaBotones, BorderLayout.SOUTH);
    }

}
