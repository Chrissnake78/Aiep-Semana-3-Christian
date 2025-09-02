import java.util.Scanner;

public class Despacho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos del vehículo
        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        String cilindrada = sc.nextLine();

        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = sc.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = sc.nextInt();

        // Datos de la compra
        System.out.print("Ingrese el total de la compra: ");
        int compra = sc.nextInt();

        System.out.print("Ingrese la distancia en km: ");
        int distancia = sc.nextInt();

        // Cálculo de despacho
        int costoDespacho;
        if (compra >= 50000 && distancia <= 20) {
            costoDespacho = 0;
        } else if (compra >= 25000 && compra <= 49999) {
            costoDespacho = 150 * distancia;
        } else {
            costoDespacho = 300 * distancia;
        }

        // Resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");
        System.out.println("El total de la compra fue: $" + compra);
        System.out.println("La distancia de despacho fue: " + distancia + " km");
        System.out.println("El costo de despacho es: $" + costoDespacho);

        sc.close();
    }
}