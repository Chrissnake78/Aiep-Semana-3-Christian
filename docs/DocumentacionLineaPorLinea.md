# Documentación línea por línea

Este documento detalla el análisis de cada línea de los programas `NombreEdad.java` y `VehiculoInfo.java`.  
El objetivo es explicar la función de cada palabra clave, identificador y símbolo usado en el código fuente.

---

## Archivo: src/NombreEdad.java

| Nº | Línea de código | Explicación detallada |
|----|-----------------|-----------------------|
| 1  | `// NombreEdad.java` | `//` indica comentario de línea. El resto del texto no se ejecuta; aquí solo se indica el nombre del archivo. |
| 2  | `// Objetivo: Solicitar nombre y edad por teclado y mostrar en pantalla.` | Comentario explicativo que resume el propósito del programa. |
| 3  | `// Compilación: javac NombreEdad.java` | Comentario que recuerda cómo compilar el programa usando el comando `javac`. |
| 4  | `// Ejecución: java NombreEdad` | Comentario que indica el comando para ejecutar la clase compilada. |
| 5  | (línea en blanco) | Separador visual, no tiene impacto en el código. |
| 6  | `import java.util.Scanner;` | `import` es palabra reservada para incluir clases externas. `java.util` es el paquete donde está la clase `Scanner`. El `;` marca el fin de la instrucción. |
| 7  | (línea en blanco) | Separador visual. |
| 8  | `public class NombreEdad {` | `public` indica que la clase es accesible desde cualquier parte. `class` declara una clase. `NombreEdad` es el nombre de la clase, que debe coincidir con el nombre del archivo. La llave `{` abre el bloque de código de la clase. |
| 9  | `    public static void main(String[] args) {` | `public` hace visible el método. `static` significa que pertenece a la clase y no a un objeto. `void` indica que no devuelve valor. `main` es el punto de entrada del programa. `String[] args` es el parámetro que recibe argumentos de la línea de comandos. |
| 10 | `        Scanner sc = new Scanner(System.in);` | `Scanner` es la clase que permite leer datos desde el teclado. `sc` es el nombre de la variable. `=` asigna el valor. `new` crea un nuevo objeto de la clase `Scanner`. `System.in` representa la entrada estándar (teclado). |
| 11 | (línea en blanco) | Separador visual. |
| 12 | `        System.out.print("Ingrese su nombre: ");` | `System.out` representa la salida estándar (pantalla). `print` muestra texto sin salto de línea. El texto entre comillas es el mensaje que verá el usuario. |
| 13 | `        String nombre = sc.nextLine();` | `String` es el tipo de dato que almacena texto. `nombre` es la variable. `=` asigna el valor. `sc.nextLine()` lee lo que el usuario escribe hasta presionar Enter. |
| 14 | (línea en blanco) | Separador visual. |
| 15 | `        System.out.print("Ingrese su edad: ");` | Igual que la línea 12, pero pide la edad. |
| 16 | `        int edad = sc.nextInt();` | `int` es el tipo de dato para números enteros. `edad` es la variable. `=` asigna el valor. `sc.nextInt()` lee un número entero ingresado por el usuario. |
| 17 | (línea en blanco) | Separador visual. |
| 18 | `        System.out.println("La persona ingresó:");` | `println` imprime texto y agrega un salto de línea al final. |
| 19 | `        System.out.println("Nombre: " + nombre);` | `+` concatena el texto `"Nombre: "` con el contenido de la variable `nombre`. Se muestra en pantalla con salto de línea. |
| 20 | `        System.out.println("Edad: " + edad);` | Igual que la anterior, pero muestra el número guardado en `edad`. |
| 21 | (línea en blanco) | Separador visual. |
| 22 | `        sc.close();` | Cierra el objeto `Scanner` para liberar recursos. |
| 23 | `    }` | Cierra el bloque del método `main`. |
| 24 | `}` | Cierra el bloque de la clase `NombreEdad`. |

---

## Archivo: src/VehiculoInfo.java

| Nº | Línea de código | Explicación detallada |
|----|-----------------|-----------------------|
| 1  | `// VehiculoInfo.java` | Comentario que indica el nombre del archivo. |
| 2  | `// Objetivo: Solicitar datos del vehículo y mostrarlos en pantalla.` | Comentario que resume lo que hace el programa. |
| 3  | `// Compilación: javac VehiculoInfo.java` | Comentario que indica el comando para compilar. |
| 4  | `// Ejecución: java VehiculoInfo` | Comentario que indica el comando para ejecutar. |
| 5  | (línea en blanco) | Separador visual. |
| 6  | `import java.util.Scanner;` | Igual que en `NombreEdad.java`, importa la clase `Scanner` desde la librería estándar. |
| 7  | (línea en blanco) | Separador visual. |
| 8  | `public class VehiculoInfo {` | Declaración de la clase pública `VehiculoInfo`. Abre con llave `{`. |
| 9  | `    public static void main(String[] args) {` | Método principal del programa. Igual estructura que en `NombreEdad.java`. |
| 10 | `        Scanner sc = new Scanner(System.in);` | Crea el objeto `Scanner` para leer desde teclado. |
| 11 | (línea en blanco) | Separador visual. |
| 12 | `        System.out.print("Ingrese la Marca: ");` | Muestra un mensaje en pantalla para solicitar la marca del vehículo. |
| 13 | `        String marca = sc.nextLine();` | Variable de tipo `String` que almacena lo ingresado como marca. |
| 14 | (línea en blanco) | Separador visual. |
| 15 | `        System.out.print("Ingrese el Modelo: ");` | Solicita al usuario el modelo del vehículo. |
| 16 | `        String modelo = sc.nextLine();` | Guarda en la variable `modelo` lo ingresado por el usuario. |
| 17 | (línea en blanco) | Separador visual. |
| 18 | `        System.out.print("Ingrese la Cilindrada: ");` | Solicita la cilindrada del vehículo. |
| 19 | `        String cilindrada = sc.nextLine();` | Variable de tipo `String` para guardar la cilindrada. |
| 20 | (línea en blanco) | Separador visual. |
| 21 | `        System.out.print("Ingrese el Tipo de Combustible: ");` | Pide el tipo de combustible (bencina, diésel, etc.). |
| 22 | `        String tipoCombustible = sc.nextLine();` | Guarda el tipo de combustible como texto. |
| 23 | (línea en blanco) | Separador visual. |
| 24 | `        System.out.print("Ingrese la Capacidad en pasajeros: ");` | Solicita la capacidad máxima de pasajeros. |
| 25 | `        int capacidad = sc.nextInt();` | Variable entera que guarda la capacidad ingresada. |
| 26 | (línea en blanco) | Separador visual. |
| 27 | `        System.out.println("La marca que ha ingresado es: " + marca);` | Muestra la marca ingresada concatenada con texto fijo. |
| 28 | `        System.out.println("El modelo que ha ingresado es: " + modelo);` | Muestra el modelo ingresado. |
| 29 | `        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);` | Muestra la cilindrada ingresada. |
| 30 | `        System.out.println("El tipo de combustible es: " + tipoCombustible);` | Muestra el tipo de combustible ingresado. |
| 31 | `        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");` | Concatena la capacidad (int) con texto, mostrando la frase completa. |
| 32 | (línea en blanco) | Separador visual. |
| 33 | `        sc.close();` | Cierra el objeto `Scanner` para liberar recursos. |
| 34 | `    }` | Cierra el método `main`. |
| 35 | `}` | Cierra la clase `VehiculoInfo`. |

---