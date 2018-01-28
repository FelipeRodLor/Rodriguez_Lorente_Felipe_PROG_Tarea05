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

    private Cliente[] clientes;
    private Alquiler[] alquileres;
    private Turismo[] turismos;

    public AlquilerVehiculos() {
        clientes = new Cliente[MAX_CLIENTES];
        alquileres = new Alquiler[MAX_ALQUILERES];
        turismos = new Turismo[MAX_TURISMOS];
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public Turismo[] getTurismos() {
        return turismos;
    }

    public Cliente getCliente(String dni) {

        int posicion = 0;
        boolean encontrado = false;
        while (posicion < clientes.length && !encontrado) {
            if (clientes[posicion] != null && clientes[posicion].getDni().equals(dni)) {
                encontrado = true;
            } else {
                posicion++;
            }
        }
        if (encontrado) {
            return clientes[posicion];
        } else {
            return null;
        }
    }

    public void addCliente(Cliente cliente) {

        int posicion = 0;
        boolean disponible = false;
        while (posicion < clientes.length && !disponible) {
            if (clientes[posicion] == null) {
                disponible = true;
            } else {
                if (clientes[posicion].getDni().equals(cliente.getDni())) {
                    throw new ExcepcionAlquilerVehiculos("El cliente ya existe");
                } else {
                    posicion++;
                }
            }
        }
        if (disponible) {
            clientes[posicion] = cliente;
        } else {
            throw new ExcepcionAlquilerVehiculos("Numero maximo de clientes superado. Se deben borrar clientes");
        }
    }

    public void delCliente(String dni) {

        int posicion = 0;
        boolean existe = false;
        while (posicion < clientes.length && !existe) {
            if (clientes[posicion] != null && clientes[posicion].getDni().equals(dni)) {
                existe = true;
            } else {
                posicion++;
            }
            if (existe) {
                for (int i = posicion; i < clientes.length - 1; i++) {
                    clientes[i] = clientes[i + 1];
                }
                clientes[clientes.length - 1] = null;
            } else {
                throw new ExcepcionAlquilerVehiculos("El cliente introducido no existe");
            }
        }
    }
}
