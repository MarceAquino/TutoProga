package models;

import utils.ValidationUtils;

public class Libro {
    private final String titulo;
    private final String autor;
    private final int numeroDePaginas;
    private int paginaActual ;

    public Libro(String titulo, String autor, int numeroDePaginas, int paginaActual) {
        this.titulo = ValidationUtils.texto(titulo,"Titulo");
        this.autor = ValidationUtils.texto(autor,"Autor");
        this.numeroDePaginas = (int) ValidationUtils.positivo(numeroDePaginas,"Numero de Paginas");
        validarRangoPagina(paginaActual);
        this.paginaActual = paginaActual;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    private void validarRangoPagina(int pagina) {
        if (pagina < 1 || pagina > this.numeroDePaginas) {
            throw new IllegalArgumentException("La página debe estar entre 1 y " + this.numeroDePaginas);
        }
    }

    public void avanzarPagina() {
        if (haTerminado()) {
            throw new IllegalStateException("Ya estás en la última página; el libro está terminado");
        }
        this.paginaActual++;
    }

    public void retrocederPagina() {
        if (this.paginaActual <= 1) {
            throw new IllegalStateException("Ya estás en la primera página; no se puede retroceder más");
        }
        this.paginaActual--;
    }

    public boolean haTerminado() {
        return this.paginaActual >= this.numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginaActual + "/" + numeroDePaginas +
                ", terminado=" + haTerminado() +
                '}';
    }
}
