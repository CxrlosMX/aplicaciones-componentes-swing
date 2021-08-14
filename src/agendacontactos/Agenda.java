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

    public Agenda() {
        lista = new ArrayList<Contacto>();
    }
    
    public void agregarContacto(Contacto c){
        lista.add(c);
        JOptionPane.showMessageDialog(null, "Contacto agregado", "Agregado", 1);
    }
    public String mostrar(){
       String cadena="";
        for (int i = 0; i <lista.size(); i++) {
          cadena="\n"+cadena+lista.get(i)+"\n";
        }
        return cadena;
    }

}
