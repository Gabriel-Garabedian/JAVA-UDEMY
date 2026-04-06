import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o nome, idade e altura de uma pessoa.
public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();

		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();

		System.out.printf("%s tem %d anos e %.2fm de altura.%n", nome, idade, altura);

		sc.close();
	}
}
