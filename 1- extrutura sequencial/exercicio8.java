import java.util.Locale;
import java.util.Scanner;

// Ler 4 valores (produto1, preco1, quantidade1) e (produto2, preco2, quantidade2). Calcular valor total.
public class exercicio8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Codigo do produto 1: ");
		int cod1 = sc.nextInt();

		System.out.print("Quantidade do produto 1: ");
		int qtd1 = sc.nextInt();

		System.out.print("Preco unitario do produto 1: ");
		double preco1 = sc.nextDouble();

		System.out.print("Codigo do produto 2: ");
		int cod2 = sc.nextInt();

		System.out.print("Quantidade do produto 2: ");
		int qtd2 = sc.nextInt();

		System.out.print("Preco unitario do produto 2: ");
		double preco2 = sc.nextDouble();

		double valorTotal = (preco1 * qtd1) + (preco2 * qtd2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

		sc.close();
	}
}
