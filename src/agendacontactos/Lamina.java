/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private Agenda agenda;

    public Lamina() {
        /*
         Clase agenda
         */
        agenda = new Agenda();
        setLayout(new BorderLayout());

        /*
         Mensaje "Agenda Contactos"
         */
        lamina2 = new JPanel();
        lamina2.setBackground(new Color(13, 80,4));
        colocarLabel(mensaje, "AGENDA CONTACTOS", lamina2, Color.WHITE, 25, Font.BOLD, "Agency FB");
        /*
         Area de inserción
         */
        laminaCampo = new JPanel();
        laminaCampo.setLayout(new DispocisionPersonalizada());
        laminaCampo.setBackground(new Color(12, 12, 0));
        colocarLabel(nombre, "Nombre: ", laminaCampo, Color.WHITE, 25, Font.ITALIC, "Agency FB");
        campoNombre = new JTextField(20);
        laminaCampo.add(campoNombre);
        colocarLabel(localidad, "Dirección : ", laminaCampo, Color.WHITE, 25, Font.ITALIC, "Agency FB");
        campoLocalidad = new JTextField(20);
        laminaCampo.add(campoLocalidad);
        colocarLabel(numero, "Numero: ", laminaCampo, Color.WHITE, 25, Font.ITALIC, "Agency FB");
        campoNumero = new JTextField(20);
        laminaCampo.add(campoNumero);


        /*
         Botones
         */
        laminaBotones = new JPanel();
        agregar = new JButton("Agregar");
        mostrar = new JButton("Mostrar");
        /*
         Asignamos el evento a los botones
         */
        agregar.addActionListener(new EventoContacto());
        mostrar.addActionListener(new EventoContacto());
        laminaBotones.add(agregar);
        laminaBotones.add(mostrar);
        //Componentes agregados a nuestra lamina
        add(lamina2, BorderLayout.NORTH);
        add(laminaCampo, BorderLayout.CENTER);
        add(laminaBotones, BorderLayout.SOUTH);
    }
    /*
     Método para poner JLabel y JTextFild
     */

    public void colocarLabel(JLabel label, String texLabel, JPanel lamina, Color color, int size, int type, String font) {
        //Label
        label = new JLabel(texLabel);
        label.setFont(new Font(font, type, size));
        label.setForeground(color);
        lamina.add(label);

    }

    //Clase que gestionara los eventos
    private class EventoContacto implements ActionListener {

        Contacto c;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == agregar) {
                if (campoNombre.getText().length() > 1 && campoNumero.getText().length() > 1) {
                    c = new Contacto(campoNombre.getText(), ((campoLocalidad.getText().length() <= 1) ? "S/N" : campoLocalidad.getText()), campoNumero.getText());
                    agenda.agregarContacto(c);
                    campoNombre.setText(null);
                    campoLocalidad.setText(null);
                    campoNumero.setText(null);
                } else {
                    JOptionPane.showMessageDialog(laminaBotones, "Campos Vacios", "Rellena todos los campos", 0);
                }
            }
            if (e.getSource() == mostrar) {
                agenda.mostrar();
                campoNombre.setText(null);
                campoLocalidad.setText(null);
                campoNumero.setText(null);

            }
        }

    }

}
