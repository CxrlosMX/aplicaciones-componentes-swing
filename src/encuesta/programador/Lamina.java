/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta.programador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
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
    /*
    Clase GestorProgramadores
    */
    private GestorProgramadores registroProgramadores;
    
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
    private final JPanel laminaSO;
    //CheckBox--
    private final JPanel laminaCheck;
    private final JLabel mensajeCheck;
    private final JCheckBox check1,check2,check3;
    
    //Slider
    private final JPanel laminaSlider;
    private final JLabel mensajeSlider;
    private final JSlider horasSlider;
    //Lamina inferior
    private final JPanel laminaInferior;
    private final JButton botonRegistro,BotonMostrar;
    public Lamina() {
        /*
        Clase
        */
        registroProgramadores=new GestorProgramadores();
        //-----
        javax.swing.border.Border borde = BorderFactory.createLineBorder(new Color(0,0,0), 2);
        setLayout(new BorderLayout());
        laminaPrincipal = new JPanel();
        laminaMensaje = new JPanel();
        laminaMensaje.setBackground(new Color(207, 67, 80));
       
        laminaNombre = new JPanel();
        laminaSO = new JPanel();
        laminaCheck=new JPanel();
        laminaSlider=new JPanel();
        laminaInferior=new JPanel();
        personalizarJLabel(mensajeBienvenida, "ENCUESTA", "Serif", 30, Font.BOLD, laminaMensaje);

        /*
         Creamos una caja vertical en la cual iran todos nuestros componentes
         */
        Box cajaVertical = Box.createVerticalBox();
        cajaVertical.setBorder(borde);
        /*
         Ventana superior
         */
        Box cajaH1 = Box.createHorizontalBox();
        nombre = new JLabel("NOMBRE");
        personalizarT(nombre, "Agency FB", 20, Font.BOLD);
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
        personalizarT(sistemaOperativo, "Agency FB", 20, Font.BOLD);
        grupoSO = new ButtonGroup();
        opWindows = new JRadioButton("Windows");
        opWindows.setBackground(new Color(90,190,125));
        opLinux = new JRadioButton("Linux");
        opLinux.setBackground(new Color(90,190,125));
        opMac = new JRadioButton("Mac");
        opMac.setBackground(new Color(90,190,125));
        grupoSO.add(opWindows);
        grupoSO.add(opLinux);
        grupoSO.add(opMac);
        cajaH2.add(sistemaOperativo);
        cajaH2.add(opWindows);
        cajaH2.add(opLinux);
        cajaH2.add(opMac);
        //laminaSO.setBorder(borde);
        laminaSO.add(cajaH2);

        //Caja para CheckBox--------------------------------
        Box cajaH3=Box.createVerticalBox();
        cajaH3.add(Box.createVerticalStrut(10));
        mensajeCheck=new JLabel("Elige tu especialidad         ");
        personalizarT(mensajeCheck, "Agency FB", 20, Font.BOLD);
        check1=new JCheckBox("Programación");
        check1.setBackground(new Color(90,190,125));
        check2=new JCheckBox("Diseño Gráfico");
        check2.setBackground(new Color(90,190,125));
        check3=new JCheckBox("Administración");
        check3.setBackground(new Color(90,190,125));
        cajaH3.add(mensajeCheck);
        cajaH3.add(check1);
        cajaH3.add(check2);
        cajaH3.add(check3);
        laminaCheck.add(cajaH3);
        //JSLider para verificar las horas de trabajo-------------------------------
         Box cajaH4=Box.createVerticalBox();
        cajaH4.add(Box.createVerticalStrut(10));
        mensajeSlider=new JLabel("Horas que dedicas en el ordenador");
        personalizarT(mensajeSlider, "Agency FB", 20, Font.BOLD);
        horasSlider=new JSlider(1, 10, 2);
        horasSlider.setBackground(new Color(90,190,125));
        horasSlider.setPreferredSize(new Dimension(50, 50));
        horasSlider.setMajorTickSpacing(1);
        horasSlider.setMinorTickSpacing(1);
        horasSlider.setPaintLabels(true);
        horasSlider.setPaintTicks(true);
        cajaH4.add(mensajeSlider);
        cajaH4.add(horasSlider);
        laminaSlider.add(cajaH4);
        //------------------------------
        Box cajaH5=Box.createHorizontalBox();
        botonRegistro=new JButton("Registrar");
        BotonMostrar=new JButton("Mostrar");
        cajaH5.add(botonRegistro);
        cajaH5.add(Box.createHorizontalStrut(60));
        cajaH5.add(BotonMostrar);
        laminaInferior.add(cajaH5);
        //------------------------------
        /*
         Cajas agregadas a la caja principal
         */
        laminaNombre.setBackground(new Color(90,190,125));
        laminaSO.setBackground(new Color(90,190,125));
        laminaCheck.setBackground(new Color(90,190,125));
        laminaSlider.setBackground(new Color(90,190,125));
        //-------------------------------------*/
        cajaVertical.add(laminaNombre);
        cajaVertical.add(laminaSO);
        cajaVertical.add(laminaCheck);
        cajaVertical.add(laminaSlider);
       
        laminaPrincipal.add(cajaVertical);
        laminaPrincipal.setBackground(new Color(12, 102, 202));
        /*
         Laminas agregadas
         */
        add(laminaMensaje, BorderLayout.NORTH);
        add(laminaPrincipal, BorderLayout.CENTER);
        add(laminaInferior,BorderLayout.SOUTH);
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
    /*
    Evento
    */
    private class EventoRegistro implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==botonRegistro){
                
               // Programador p=new Programador(campoNombre.getText(),(String)grupoSO.getSelection(), null, WIDTH);
                
            }
            
        }
    
    }
}
