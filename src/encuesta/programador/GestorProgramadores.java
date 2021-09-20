/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta.programador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12-sep-2021
 *
 */
public class GestorProgramadores {

    private final ArrayList<Programador> control;
    private int contador;

    public GestorProgramadores() {
        control = new ArrayList<>();
        contador = -1;
    }

    public void agregarProgramador(Programador p) {
        control.add(p);
        JOptionPane.showMessageDialog(null, "Tu informaciòn se registro correctamente", "Registro con exito", 1);
        contador++;
    }

    public String mostrarControl() {
        if(contador!=-1){
        String cadena = "";
        for (Programador i : control) {
            cadena +=i+"\n";
        }
        return cadena;
    }
        return "REGISTRO VACIO";
    }
}
