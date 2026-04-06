import java.util.Locale;
import java.util.Scanner;

// Ler uma nota do teclado e informar se o aluno esta APROVADO (>=6), EXAME (<6 e >=4) ou REPROVADO (<4).
public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota do aluno (0-10): ");
		double nota = sc.nextDouble();

		if (nota >= 6.0) {
			System.out.println("Aluno APROVADO!");
		} else if (nota >= 4.0) {
			System.out.println("Aluno em EXAME.");
		} else {
			System.out.println("Aluno REPROVADO.");
		}

		sc.close();
	}
}
