import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
 
        System.out.print("Precio: ");
        double precio = Double.parseDouble(sc.nextLine().replace(',', '.'));
 
        System.out.print("Cantidad disponible: ");
        int cantidad = Integer.parseInt(sc.nextLine());
 
        double total = precio * cantidad;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("productos.txt", true))) {
 
            bw.write("Producto: " + nombre);
            bw.newLine();
            bw.write("Precio: $" + precio);
            bw.newLine();
            bw.write("Cantidad: " + cantidad);
            bw.newLine();
            bw.write("Valor total: $" + total);
            bw.newLine();
            bw.write("-----------------------");
            bw.newLine();
 
            System.out.println("Producto guardado en productos.txt");
 
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
