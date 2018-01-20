/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Felipillo
 */
public class Cliente {

    private String nombre;
    private String dni;
    private String direccion;
    private String localidad;
    private String codigoPostal;
    private int identificador;
    private static int numClientes;

    public Cliente(String nombre, String dni, String direccion, String localidad, String codigoPostal) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;

        if (compruebaDni(dni)) {
            this.dni = dni;
        } else {
            throw new ExcepcionAlquilerVehiculos("El DNI introducido no es correcto");
        }
        if (compruebaCodigoPostal(codigoPostal)) {
            this.codigoPostal = codigoPostal;
        } else {
            throw new ExcepcionAlquilerVehiculos("El Codigo postal introducido no es correcto");
        }

    }

    private boolean compruebaDni(String dni) {
        Pattern patron = Pattern.compile("[0-9]{8}[a-zZ-a]{1}");
        Matcher emparejador;
        emparejador = patron.matcher(dni);

        return emparejador.matches();

    }

    private boolean compruebaCodigoPostal(String codigoPostal
    ) {
        Pattern patron = Pattern.compile("([0-9] {5})");
        Matcher emparejador;
        emparejador = patron.matcher(codigoPostal);

        return emparejador.matches();

    }
}
