/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.christopher_0904_25_19857.gestionbiblioteca.servicio;

import com.christopher_0904_25_19857.gestionbiblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author umg
 */
public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libro != null) {
            libros.add(libro);
        }
    }

    public List<Libro> obtenerLibros() {
        // Retornamos una copia para proteger la encapsulación
        return new ArrayList<>(this.libros);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
