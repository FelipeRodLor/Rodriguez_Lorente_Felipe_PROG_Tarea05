/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Felipillo
 */
public class Alquiler {

    private Date fecha;
    private int dias;
    private final SimpleDateFormat FORMATO_FECHA;
    private final int MS_DIA;
    private final double PRECIO_DIA;
    private Cliente cliente;
    private Turismo turismo;

    public Alquiler(Cliente cliente, Turismo turismo) {

        this.cliente = cliente;
        this.turismo = turismo;
        fecha = new Date();
        dias = 0;
        turismo.setDisponible(false);

    }

    public Date getFecha() {
        return fecha;
    }

    public int getDias() {
        return dias;
    }

    public double getPRECIO_DIA() {
        return PRECIO_DIA;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Turismo getTurismo() {
        return turismo;
    }

}
