import java.util.Locale;

// Fazer um programa para ler um valor do tipo double e depois imprimir com 3 casas decimais.
public class exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double valor = 10.35789;

		System.out.printf("%.3f%n", valor);
	}
}
