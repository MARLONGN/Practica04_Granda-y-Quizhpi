/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.marlon_proyect_practica_4.controlador;

import ec.edu.ups.marlon_proyect_practica_4.modelo.Biblioteca;
import ec.edu.ups.marlon_proyect_practica_4.modelo.Libro;
import ec.edu.ups.marlon_proyect_practica_4.modelo.Prestamo;
import ec.edu.ups.marlon_proyect_practica_4.modelo.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author davidvargas
 */
public class ControladorUsuario {
    private List<Usuario> listaUsuarios;
    private Map<String, Usuario> usuariosPorId;
    private Biblioteca biblioteca;

    public ControladorUsuario (Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.listaUsuarios = new ArrayList<>();
        this.usuariosPorId = new HashMap<>();
    }

    public void registrarUsuario(Usuario usuario) {
        biblioteca.registrarUsuario(usuario);
    }

    public void solicitarPrestamo(Usuario usuario, Libro libro) {
        usuario.solicitarPrestamo(libro);
    }

    public boolean devolverLibro(Usuario usuario, Libro libro) {
    for (Prestamo prestamo : usuario.getListaPrestamos()) {
        if (prestamo.getLibro().equals(libro) && prestamo.esPrestamoVigente()) {
            usuario.eliminarPrestamo(libro);
            libro.setDisponible(true);
            return true;
        }
    }
    return false;
}

    public void guardarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        usuariosPorId.put(usuario.getIdentificacion(), usuario);
        System.out.println("Usuario guardado en la base de datos.");
    }

    public Usuario buscarUsuarioPorId(String id) {
        return usuariosPorId.get(id);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Usuario usuario : listaUsuarios) {
            for (Prestamo prestamo : usuario.getListaPrestamos()) {
                if (prestamo.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
                    return prestamo.getLibro();
                }
            }
        }
        return null;
    }

    public Usuario obtenerUsuarioQuePrestoLibro(Libro libro) {
        for (Usuario usuario : listaUsuarios) {
            for (Prestamo prestamo : usuario.getListaPrestamos()) {
                if (prestamo.getLibro().equals(libro) && prestamo.esPrestamoVigente()) {
                    return usuario;
                }
            }
        }
        return null;
    }

    public Prestamo obtenerPrestamo(Usuario usuario, Libro libro) {
        for (Prestamo prestamo : usuario.getListaPrestamos()) {
            if (prestamo.getLibro().equals(libro)) {
                return prestamo;
            }
        }
        return null;
    }

}
