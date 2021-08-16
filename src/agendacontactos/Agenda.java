/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12/08/2021
 *
 */
public class Agenda {

    private ArrayList<Contacto> lista;
    private int contador;

    public Agenda() {
        lista = new ArrayList<Contacto>();
        contador = -1;
    }

    public void agregarContacto(Contacto c) {
        lista.add(c);
        contador++;
        JOptionPane.showMessageDialog(null, "Contacto agregado", "Agregado", 1);
    }

    public void mostrar() {

        if (contador != -1) {
            String cadena = "";
            for (int i = 0; i < lista.size(); i++) {
                cadena = "\n" + cadena + lista.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, "Agenda Contactos\n" + cadena, "Agenda", 1);

        } else {
            JOptionPane.showMessageDialog(null, "Agenda Vacia", "Agenda", 0);
        }

    }

}
