import java.util.Scanner; // Scanner permite leer desde teclado

public class NombreEdad { // define la clase; debe llamarse igual que el archivo
    public static void main(String[] args) { // punto de entrada del programa
        Scanner sc = new Scanner(System.in); // crea lector de consola

        System.out.print("Ingrese su nombre: "); // pide nombre
        String nombre = sc.nextLine(); // lee texto completo

        System.out.print("Ingrese su edad: "); // pide edad
        int edad = sc.nextInt(); // lee número entero

        System.out.println("La persona ingresó:"); // título
        System.out.println("Nombre: " + nombre); // muestra nombre
        System.out.println("Edad: " + edad); // muestra edad

        sc.close(); // cierra el scanner
    }
}