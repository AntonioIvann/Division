import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainDivision { // Declara una clase pública llamada MainDivision
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner di = new Scanner(System.in); // Crea un objeto Scanner llamado di para leer la entrada del usuario

        System.out.println("Dame el primer valor: "); // Solicita al usuario que ingrese el primer valor
        int n1 = di.nextInt(); // Lee el primer valor proporcionado por el usuario

        System.out.println("Dame el segundo valor: "); // Solicita al usuario que ingrese el segundo valor
        int n2 = di.nextInt(); // Lee el segundo valor proporcionado por el usuario

        Division d1 = new Division(); // Crea un objeto de la clase Division llamado d1

        // Asigna los valores proporcionados por el usuario al objeto d1
        d1.setN1(n1);
        d1.setN2(n2);

        // Muestra el resultado de la división utilizando el método mostrarResultado() de d1
        d1.mostrarResultado();
        System.out.println("El resultado de la division es: " + d1.mostrarResultado());

        // Muestra una representación textual del objeto d1 utilizando el método toString()
        System.out.println(d1.toString());
    }
}
