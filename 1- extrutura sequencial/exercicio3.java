import java.util.Locale;
import java.util.Scanner;

// Ler 4 valores inteiros A, B, C e D. Imprimir a DIFERENCA do produto de A e B pelo produto de C e D.
public class exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite A: ");
		int a = sc.nextInt();

		System.out.print("Digite B: ");
		int b = sc.nextInt();

		System.out.print("Digite C: ");
		int c = sc.nextInt();

		System.out.print("Digite D: ");
		int d = sc.nextInt();

		int diferenca = (a * b) - (c * d);

		System.out.println("DIFERENCA = " + diferenca);

		sc.close();
	}
}
