import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Se crea la carpeta "datos" por si no existe
        File carpeta = new File("datos");
        carpeta.mkdir();

        File archivo = new File("datos/prueba.txt");

        // 1. Comprobacion previa
        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
        } else {
            System.out.println("El archivo no existe. Intentando crearlo...");
            // 2. Creacion controlada
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }

        // 3. Extraccion de informacion
        System.out.println("Nombre del archivo: " + archivo.getName());
        System.out.println("Ruta del archivo: " + archivo.getPath());
    }
}
