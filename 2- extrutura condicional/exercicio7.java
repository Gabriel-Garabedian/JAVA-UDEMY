import java.util.Locale;
import java.util.Scanner;

// Ler a idade de uma pessoa e informar sua categoria de classificacao etaria:
// Infantil (0-10), Juvenil (11-17), Adulto (18-59), Idoso (60+)
public class exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();

		if (idade < 0) {
			System.out.println("Idade invalida!");
		} else if (idade <= 10) {
			System.out.println("Categoria: INFANTIL");
		} else if (idade <= 17) {
			System.out.println("Categoria: JUVENIL");
		} else if (idade <= 59) {
			System.out.println("Categoria: ADULTO");
		} else {
			System.out.println("Categoria: IDOSO");
		}

		sc.close();
	}
}
