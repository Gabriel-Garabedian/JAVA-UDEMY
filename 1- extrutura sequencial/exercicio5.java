import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia nome, sexo e idade de uma pessoa e imprima se ela e do sexo masculino ou feminino.
public class exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Sexo (M/F): ");
		char sexo = sc.nextLine().charAt(0);

		System.out.print("Idade: ");
		int idade = sc.nextInt();

		System.out.printf("Nome: %s, Sexo: %c, Idade: %d%n", nome, sexo, idade);

		sc.close();
	}
}
