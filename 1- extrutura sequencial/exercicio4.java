import java.util.Locale;
import java.util.Scanner;

// Ler o numero de um funcionario, horas trabalhadas e valor por hora. Calcular e mostrar o salario.
public class exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero do funcionario: ");
		int numero = sc.nextInt();

		System.out.print("Horas trabalhadas: ");
		int horas = sc.nextInt();

		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();

		double salario = horas * valorHora;

		System.out.printf("Numero: %d%n", numero);
		System.out.printf("Salario = U$ %.2f%n", salario);

		sc.close();
	}
}
