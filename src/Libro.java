/**
 * Clase BASE que representa un Libro genérico.
 * Se prepara cambiando 'private' por 'protected' para que las
 * clases derivadas puedan heredar y reutilizar sus atributos.
 */
public class Libro {
    // 1. ATRIBUTOS PROTEGIDOS (Visibles para las clases hijas)
    protected String titulo;
    protected String autor;
    protected boolean disponible;

    // 2. CONSTRUCTOR (Inicializa las propiedades comunes)
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // 3. MÉTODOS REUTILIZABLES (Las clases hijas los heredan automáticamente)
    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado con éxito.");
        } else {
            System.out.println("Lo sentimos, '" + titulo + "' ya está prestado.");
        }
    }

    public void devolverLibro() {
        disponible = true;
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }

    public void mostrarInformacion() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Estado: " + estado);
    }
}
