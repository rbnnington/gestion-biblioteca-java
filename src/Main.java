/**
 * Clase principal que ejecuta la aplicación de prueba.
 * Aquí se realiza la instanciación de objetos y uso de métodos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE BIBLIOTECA ===");

        // 1. INSTANCIACIÓN DE OBJETOS (Crear objetos a partir de la clase)
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("1984", "George Orwell");

        // 2. PRUEBA DE MÉTODOS
        System.out.println("\n--- Estado Inicial ---");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        System.out.println("\n--- Simulando Préstamo ---");
        libro1.prestarLibro(); // Se presta con éxito
        libro1.prestarLibro(); // Intento fallido (ya está prestado)

        System.out.println("\n--- Estado Actualizado ---");
        libro1.mostrarInformacion();

        System.out.println("\n--- Simulando Devolución ---");
        libro1.devolverLibro();
        libro1.mostrarInformacion();
    }
}
