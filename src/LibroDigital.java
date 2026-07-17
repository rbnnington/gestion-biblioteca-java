public class LibroDigital extends Libro {
    // Atributo propio de la clase derivada
    private String formato; // Ejemplo: "PDF", "EPUB"

    // Constructor: Recibe parámetros de la base + el propio
    public LibroDigital(String titulo, String autor, String formato) {
        super(titulo, autor); // Llama al constructor de Libro
        this.formato = formato;
    }

    // Sobrescritura de método (Polimorfismo) para reutilizar y expandir
    @Override
    public void mostrarInformacion() {
        // Reutiliza el método de la clase base
        super.mostrarInformacion();
        // Añade la información específica de esta subclase
        System.out.println("Formato Digital: " + formato);
    }
}
