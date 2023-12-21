/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.marlon_proyect_practica_4.controlador;

import java.util.Date;

/**
 *
 * @author davidvargas
 */
public class ControladorPrestamo {
    public int calcularDiasPrestamo(Date fechaPrestamo) {
        Date fechaActual = new Date();
        long tiempoPrestamo = fechaActual.getTime() - fechaPrestamo.getTime();
        return (int) (tiempoPrestamo / (1000 * 60 * 60 * 24));
    }

    public boolean esPrestamoVigente(Date fechaPrestamo) {
        int maxDiasPrestamo = 20;
        return calcularDiasPrestamo(fechaPrestamo) <= maxDiasPrestamo;
    }
}
