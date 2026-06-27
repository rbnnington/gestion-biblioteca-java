/**
 * Clase que representa un Libro en el sistema de la biblioteca.
 * Aplica los conceptos de atributos, constructores y métodos.
 */
public class Libro {
    // 1. ATRIBUTOS (Definición de propiedades)
    private String titulo;
    private String autor;
    private boolean disponible;

    // 2. CONSTRUCTOR (Inicializa el objeto al ser creado)
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Por defecto, todo libro nuevo está disponible
    }

    // 3. MÉTODOS (Acciones que el objeto puede realizar)

    // Método para prestar el libro
    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado con éxito.");
        } else {
            System.out.println("Lo sentimos, '" + titulo + "' ya está prestado.");
        }
    }

    // Método para devolver el libro
    public void devolverLibro() {
        disponible = true;
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }

    // Método para mostrar la información del libro
    public void mostrarInformacion() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Estado: " + estado);
    }
}
