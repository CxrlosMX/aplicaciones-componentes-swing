/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12/08/2021
 *
 */
public class Contacto {

    private String nombre;
    private String localidad;
    private String numero;

    public Contacto(String nombre, String apellido, String numero) {
        this.nombre = nombre;
        this.localidad = apellido;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return localidad;
    }

    public void setApellido(String apellido) {
        this.localidad = apellido;
    }

    

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + localidad + "\nNumero: " + numero;
    }

}
