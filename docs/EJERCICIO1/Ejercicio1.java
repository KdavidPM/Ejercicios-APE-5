import java.io.File;
import java.io.IOException;
public class Ejercicio1 {
    public static void main(String[] args) {
        File archivo = new File("curso.txt");
        
        try{
            if (archivo.createNewFile()) {
                System.out.println("Se creo correctamente el archivo.");
            } else{
                System.out.println("Ya existe un archivo con ese nombre.");
            }
            System.out.println("El nombre del archivo es: " + archivo.getName());
        } catch(IOException e){
            System.out.println("Ocurrio un error al ejecutar el programa.");
        }
    }
}
