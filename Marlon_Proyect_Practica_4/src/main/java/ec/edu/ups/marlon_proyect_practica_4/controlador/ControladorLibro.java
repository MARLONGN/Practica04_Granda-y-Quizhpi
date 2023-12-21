/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.marlon_proyect_practica_4.controlador;

import ec.edu.ups.marlon_proyect_practica_4.modelo.Libro;
import ec.edu.ups.marlon_proyect_practica_4.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidvargas
 */
public class ControladorLibro {
    private List<Libro> listaLibros;
    private ControladorUsuario usuarioControlador;

    public ControladorLibro(ControladorUsuario usuarioControlador) {
        this.listaLibros = new ArrayList<>();
        this.usuarioControlador = usuarioControlador;
    }
    public void guardarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro guardado en la base de datos.");
    }

    public Libro buscarLibroPorTitulo(String titulo) {
    for (Libro libro : listaLibros) {
        System.out.println("Título del libro: " + libro.getTitulo());
        if (libro.getTitulo().equalsIgnoreCase(titulo)) {
            return libro;
        }
    }
    return null;
}

    public Usuario obtenerUsuarioQuePrestoLibro(Libro libro) {
        return usuarioControlador.obtenerUsuarioQuePrestoLibro(libro);
    }
    public void marcarLibroComoDisponible(Libro libro) {
        // Encontrar el libro en la lista y marcarlo como disponible
        for (Libro l : listaLibros) {
            if (l.equals(libro)) {
                l.setDisponible(true);
                System.out.println("Libro marcado como disponible: " + l.getTitulo());
                break;
            }
        }
    }
}
