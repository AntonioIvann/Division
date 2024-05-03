import java.util.Scanner;

public class MainDivision {
    public static void main(String[] args) {
        Scanner di = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int n1 = di.nextInt();
        System.out.println("Dame el segundo valor: ");
        int n2 = di.nextInt();

        Division d1 = new Division();
        d1.setN1(n1);
        d1.setN2(n2);
        d1.mostrarResultado();
        System.out.println("El resultado de la division es: " + d1.mostrarResultado());
        System.out.println(d1.toString());
    }
}
