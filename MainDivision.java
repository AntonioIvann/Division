import java.util.Scanner;

public class MainDivision {
    public static void main(String[] args) {
        Scanner d1 = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int n1 = d1.nextInt();
        System.out.println("Dame el segundo valor: ");
        int n2 = d1.nextInt();
        Division d2 = new Division();
        d2.n1 = n1;
        d2.n2 = n2;
        System.out.println("El resultado es: " + d2.mostrarResultado());

    }
}