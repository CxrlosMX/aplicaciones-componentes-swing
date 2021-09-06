/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropeliculas;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 30/08/2021
 *
 */
public class GestionPeliculas {

    private final ArrayList<PeliculaClasss> lista;
    private final int contador;

    public GestionPeliculas() {
        lista = new ArrayList<>();
        contador = -1;

    }

    //Método para agregar una pelicula
    public void addPelicula(PeliculaClasss pelicula) {
        lista.add(pelicula);
        JOptionPane.showMessageDialog(null, "Pelicula Agregada Correctamente", pelicula.getNombre() + " Agregada", 1,new ImageIcon("recursos/movie.png"));
    }

    //Método para mostrar las peliculas de nuestra lista
    public void showMovies() {
        String cadena = "";
        for (PeliculaClasss i : lista) {
            cadena +="\n"+ i + "\n";
        }
        JOptionPane.showMessageDialog(null, "MOVIES\n" + cadena, "Registro Peliculas", 1,new ImageIcon("recursos/net.png"));
    }
}
