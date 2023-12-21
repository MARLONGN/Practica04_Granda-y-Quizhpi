/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.marlon_proyect_practica_4.controlador;

import ec.edu.ups.marlon_proyect_practica_4.modelo.Libro;
import ec.edu.ups.marlon_proyect_practica_4.modelo.Prestamo;
import ec.edu.ups.marlon_proyect_practica_4.modelo.Usuario;
import ec.edu.ups.marlon_proyect_practica_4.modelo.Biblioteca;
import java.util.Iterator;

/**
 *
 * @author davidvargas
 */
public class ControladorBiblioteca {
    private Biblioteca biblioteca;

    public ControladorBiblioteca (Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    

    public void agregarLibro(Libro libro) {
        biblioteca.agregarLibro(libro);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        return biblioteca.buscarLibro(titulo);
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (libro.isDisponible()) {
            Prestamo prestamo = new Prestamo(libro, usuario);
            usuario.agregarPrestamo(prestamo);
            libro.prestar();
            System.out.println("Préstamo se ha realizado exitosamente.");
        } else {
            System.out.println("El libro no está disponible para ser préstado.");
        }
    }
    public void devolverLibro(Libro libroDevolver, Usuario usuarioDevolucion) {
        boolean libroPrestado = false;

        for (Prestamo prestamo : usuarioDevolucion.getListaPrestamos()) {
            if (prestamo.getLibro().equals(libroDevolver) && prestamo.esPrestamoVigente()) {
                libroPrestado = true;
                break;
            }
        }

        if (libroPrestado) {
            libroDevolver.setDisponible(true);
            Iterator<Prestamo> iterator = usuarioDevolucion.getListaPrestamos().iterator();
            while (iterator.hasNext()) {
                Prestamo prestamo = iterator.next();
                if (prestamo.getLibro().equals(libroDevolver) && prestamo.esPrestamoVigente()) {
                    iterator.remove();
                    break;
                }
            }
            System.out.println("Devolución exitosa. Libro marcado como disponible.");
        } else {
            System.out.println("Error: El usuario no tiene el libro prestado o el préstamo ha expirado.");
        }
    }
}
