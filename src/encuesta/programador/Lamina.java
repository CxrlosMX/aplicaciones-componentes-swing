/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta.programador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12-sep-2021
 *
 */
public class Lamina extends JPanel {

    private final JPanel laminaPrincipal;
    private JLabel mensajeBienvenida;
    private final JPanel laminaMensaje;

    /*
     Centro
     */
    private final JPanel laminaNombre;
    private final JLabel nombre;
    private final JTextField campoNombre;
    /*
     Radio Button
     */
    private final JLabel sistemaOperativo;
    private final ButtonGroup grupoSO;
    private final JRadioButton opWindows, opLinux, opMac;
    private JPanel laminaSO;

    public Lamina() {
        javax.swing.border.Border borde = BorderFactory.createLineBorder(new Color(12, 45, 120), 2);
        setLayout(new BorderLayout());
        laminaPrincipal = new JPanel();
        laminaMensaje = new JPanel();
        laminaNombre = new JPanel();
        laminaSO = new JPanel();
        personalizarJLabel(mensajeBienvenida, "ENCUESTA", "Serif", 30, Font.ITALIC, laminaMensaje);

        /*
         Creamos una caja vertical en la cual iran todos nuestros componentes
         */
        Box cajaVertical = Box.createVerticalBox();

        /*
         Ventana superior
         */
        Box cajaH1 = Box.createHorizontalBox();
        nombre = new JLabel("NOMBRE");
        personalizarT(nombre, "Serif", 20, Font.ITALIC);
        campoNombre = new JTextField(10);
        cajaH1.add(nombre);
        cajaH1.add(Box.createHorizontalStrut(20));
        cajaH1.add(campoNombre);
       // laminaNombre.setBorder(borde);
        laminaNombre.add(cajaH1);
        /*
         Caja radioButton
         */
        Box cajaH2 = Box.createVerticalBox();
        cajaH2.add(Box.createVerticalStrut(10));
        sistemaOperativo = new JLabel("Elige un sistema operativo");
        personalizarT(sistemaOperativo, "Serif", 20, Font.ITALIC);
        grupoSO = new ButtonGroup();
        opWindows = new JRadioButton("Windows");
        opLinux = new JRadioButton("Linux");
        opMac = new JRadioButton("Mac");
        grupoSO.add(opWindows);
        grupoSO.add(opLinux);
        grupoSO.add(opMac);
        cajaH2.add(sistemaOperativo);
        cajaH2.add(opWindows);
        cajaH2.add(opLinux);
        cajaH2.add(opMac);
        //laminaSO.setBorder(borde);
        laminaSO.add(cajaH2);
        /*
         Cajas agregadas a la caja principal
         */
        cajaVertical.add(laminaNombre);
        cajaVertical.add(laminaSO);
        laminaPrincipal.add(cajaVertical);
        /*
         Laminas agregadas
         */
        add(laminaMensaje, BorderLayout.NORTH);
        add(laminaPrincipal, BorderLayout.CENTER);
    }

    /*
     Mètodo que personaliza JLabel
     */
    public void personalizarJLabel(JLabel label, String mensaje, String letra, int tamagno, int tipoLetra, JPanel lamina) {
        label = new JLabel(mensaje);
        label.setFont(new Font(letra, tipoLetra, tamagno));
        lamina.add(label);
    }

    public void personalizarT(JLabel label, String letra, int tamagno, int tipoLetra) {
        label.setFont(new Font(letra, tipoLetra, tamagno));
    }
}
