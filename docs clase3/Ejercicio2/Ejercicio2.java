import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            // 1. Flujo de salida BufferedWriter enlazado con FileWriter
            BufferedWriter escritor = new BufferedWriter(new FileWriter("materias.txt"));

            // 2 y 3. Escribir cinco asignaturas, una por linea
            escritor.write("Matematicas");
            escritor.newLine();
            escritor.write("Fisica");
            escritor.newLine();
            escritor.write("Quimica");
            escritor.newLine();
            escritor.write("Biologia");
            escritor.newLine();
            escritor.write("Programacion");
            escritor.newLine();

            // 4. Cerrar el flujo
            escritor.close();
            System.out.println("Archivo materias.txt creado con 5 asignaturas.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
