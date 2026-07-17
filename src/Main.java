public class Main {
    public static void main(String[] args) {
        // Creación de objetos de las clases derivadas
        LibroDigital libroEbook = new LibroDigital("Dune", "Frank Herbert", "EPUB");
        LibroFisico libroImpreso = new LibroFisico("1984", "George Orwell", "Estante B4");

        System.out.println("--- PRUEBA LIBRO DIGITAL ---");
        // Reutiliza el método heredado directamente de la clase base
        libroEbook.prestarLibro();
        // Llama al método modificado que incluye el formato
        libroEbook.mostrarInformacion();

        System.out.println("\n--- PRUEBA LIBRO FÍSICO ---");
        // Reutiliza métodos de la base y usa los propios
        libroImpreso.mostrarInformacion();
        libroImpreso.cambiarUbicacion("Estante C1");
    }
}
