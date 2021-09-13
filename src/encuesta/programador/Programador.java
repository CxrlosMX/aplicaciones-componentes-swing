/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta.programador;

import java.util.ArrayList;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12-sep-2021
 *
 */
public class Programador {

    private final String nombre;
    private final String sistemaOPerativo;
    private final ArrayList<String> especialidad;
    private final int horasDedicadas;

    public Programador(String nombre, String sistemaOPerativo, ArrayList<String> especialidad, int horasDedicadas) {
        this.nombre = nombre;
        this.sistemaOPerativo = sistemaOPerativo;
        this.especialidad = especialidad;
        this.horasDedicadas = horasDedicadas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nSistema OPerativo: " + sistemaOPerativo + "\nEspecialidad: " + especialidad + "\nHoras Dedicadas: " + horasDedicadas;
    }

}
