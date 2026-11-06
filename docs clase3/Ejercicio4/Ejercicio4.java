import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Se crea la carpeta "datos" por si no existe
        File carpeta = new File("datos");
        carpeta.mkdir();

        // 1. Objeto File con la ruta indicada
        File archivo = new File("datos/temporal.txt");

        // 2. Consultar estado y crear si no existe
        if (archivo.exists()) {
            System.out.println("El archivo ya existe: " + archivo.getPath());
        } else {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado: " + archivo.getPath());
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }

        // 3. Variable de control para confirmar el borrado
        boolean confirmarBorrado = true;

        // 4. Borrar solo si hay confirmacion
        if (confirmarBorrado) {
            boolean eliminado = archivo.delete();
            System.out.println("Resultado de la eliminacion: " + eliminado);
            if (eliminado) {
                System.out.println("El archivo fue eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }
        } else {
            System.out.println("Borrado cancelado por el usuario.");
        }
    }
}
