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
public class AlquilerVehiculos {
    private final int MAX_TURISMOS = 100;
    private final int MAX_CLIENTES = 100;
    private final int MAX_ALQUILERES = 100;
    
   private Cliente [] cliente;
   private Alquiler [] alquiler;
   private Turismo [] turismo;
   
    public AlquilerVehiculos (){
       cliente = new Cliente [MAX_CLIENTES];
       alquiler = new Alquiler [MAX_ALQUILERES];
       turismo = new Turismo [MAX_TURISMOS];
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public Alquiler[] getAlquiler() {
        return alquiler;
    }

    public Turismo[] getTurismo() {
        return turismo;
    }
    
    
    
}
