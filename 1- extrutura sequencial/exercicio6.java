import java.util.Locale;
import java.util.Scanner;

// Ler 3 valores inteiros e mostrar a soma dos quadrados dos 3 valores lidos.
public class exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor 1: ");
		int v1 = sc.nextInt();

		System.out.print("Digite o valor 2: ");
		int v2 = sc.nextInt();

		System.out.print("Digite o valor 3: ");
		int v3 = sc.nextInt();

		int somaQuadrados = (v1 * v1) + (v2 * v2) + (v3 * v3);

		System.out.printf("Soma dos quadrados = %d%n", somaQuadrados);

		sc.close();
	}
}
