import java.util.Scanner;

public class VehiculoInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la Marca: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese el Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ingrese la Cilindrada: ");
        String cilindrada = sc.nextLine();

        System.out.print("Ingrese el Tipo de Combustible: ");
        String tipoCombustible = sc.nextLine();

        System.out.print("Ingrese la Capacidad en pasajeros: ");
        int capacidad = sc.nextInt();

        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        sc.close();
    }
}