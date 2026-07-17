public class LibroFisico extends Libro {
    // Atributo propio
    private String estante; // Ejemplo: "Pasillo A, Estante 3"

    public LibroFisico(String titulo, String autor, String estante) {
        super(titulo, autor); // Reutiliza el constructor base
        this.estante = estante;
    }

    // Uso directo de un atributo 'protected' de la clase base
    public void cambiarUbicacion(String nuevoEstante) {
        this.estante = nuevoEstante;
        // Acceso directo a 'titulo' gracias a 'protected'
        System.out.println("El libro físico '" + titulo + "' se movió a: " + estante);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Ubicación en Sala: " + estante);
    }
}
