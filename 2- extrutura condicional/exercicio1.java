import java.util.Scanner;

// Ler um numero inteiro e dizer se e PAR ou IMPAR.
public class exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();
	}
}
