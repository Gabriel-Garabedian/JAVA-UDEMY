import java.util.Locale;
import java.util.Scanner;

// Ler o raio de um circulo e calcular a area. Area = pi * raio^2
public class exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o raio do circulo: ");
		double raio = sc.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);

		System.out.printf("Area do circulo = %.3f%n", area);

		sc.close();
	}
}
