// 1. Importar la clase necesaria para trabajar con archivos
import java.io.File;

public class EliminarArchivo {

    public static void main(String[] args) {

        // 2. Crear un objeto File con el nombre del archivo a eliminar
        File archivo = new File("estudiantes.txt");

        // 3. Utilizar delete() para intentar eliminar el archivo
        // 4. Comprobar si la eliminación se realizó correctamente
        if (archivo.delete()) {
            // 5. Mensaje de confirmación
            System.out.println("El archivo " + archivo.getName() + " fue eliminado correctamente.");
        } else {
            // 6. Mensaje indicando el problema
            if (!archivo.exists()) {
                System.out.println("No se pudo eliminar: el archivo " + archivo.getName() + " no existe.");
            } else {
                System.out.println("No se pudo eliminar el archivo " + archivo.getName()
                        + ". Puede estar abierto o no tener permisos.");
            }
        }
    }
}
