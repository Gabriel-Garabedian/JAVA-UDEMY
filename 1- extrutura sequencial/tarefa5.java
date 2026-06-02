import java.util.Locale;
import java.util.Scanner;

public class tarefa5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo_peca1 = sc.nextInt();
        int numero_peca1 = sc.nextInt();
        double valor_unitario1 = sc.nextDouble();

        int codigo_peca2 = sc.nextInt();
        int numero_peca2 = sc.nextInt();
        double valor_unitario2 = sc.nextDouble();

        double pagar = (numero_peca1 * valor_unitario1) + (numero_peca2 * valor_unitario2);

        System.out.println("PECAS 1 e 2:");
        System.out.println("CODIGO: " + codigo_peca1);
        System.out.println("CODIGO: " + codigo_peca2);

        System.out.printf("VALOR A PAGAR = %.2f%n", pagar);

        sc.close();
    }
}
