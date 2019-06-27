/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Ahmad
 */
public class Descripcion_Libro {
       private int id;
       private String titulo;
       private String autor;
       private String genero;
       private short anio_publicacion;
       private short numero_paginas;
       private String idioma;
       private String ISBN;

       
    
    /** Constructor para insertar  descripciones de libros
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param genero genero principal del libro
     * @param anio_publicacion año publicacion del libro
     * @param numero_paginas numero de paginas del libro
     * @param idioma idioma del libro
     * @param ISBN ISBN del libro **/
    public Descripcion_Libro(String titulo, String autor, String genero, short anio_publicacion, short numero_paginas, String idioma, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio_publicacion = anio_publicacion;
        this.numero_paginas = numero_paginas;
        this.idioma = idioma;
        this.ISBN = ISBN;
    }
    
     /** Constructor para actualizar  descripciones de libros
     * @param id id del libro
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param genero genero principal del libro
     * @param anio_publicacion año publicacion del libro
     * @param numero_paginas numero de paginas del libro
     * @param idioma idioma del libro
     * @param ISBN ISBN del libro **/
       
    public Descripcion_Libro(int id, String titulo, String autor, String genero, short anio_publicacion, short numero_paginas, String idioma, String ISBN) {
       this(titulo, autor, genero, anio_publicacion, numero_paginas, idioma, ISBN);
       this.id = id;
    }

    /** Getters y setters necesarios
     * @return  retorna id de la descripcion del libro**/
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public short getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(short anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public short getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(short numero_paginas) {
        //No deberian haber menos de 0 paginas por libro.
        if(numero_paginas >= 0)
            this.numero_paginas = numero_paginas;
        else
            this.numero_paginas = 0;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
       
       
}
