/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

/**
 *
 * @author Felipillo
 */
public class ExcepcionAlquilerVehiculos extends RuntimeException {

    /**
     * @param args the command line arguments
     */
    public ExcepcionAlquilerVehiculos(String mensaje) {

        super(mensaje);
    }

}
