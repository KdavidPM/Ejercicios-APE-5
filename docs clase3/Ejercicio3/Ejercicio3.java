import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            // 1. FileWriter en modo de adicion (append = true)
            BufferedWriter escritor = new BufferedWriter(new FileWriter("materias.txt", true));

            // 2. Agregar dos asignaturas al final
            escritor.write("Ingles");
            escritor.newLine();
            escritor.write("Estadistica");
            escritor.newLine();

            // 3. Cerrar el flujo
            escritor.close();
            System.out.println("Se agregaron 2 asignaturas al final de materias.txt.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
