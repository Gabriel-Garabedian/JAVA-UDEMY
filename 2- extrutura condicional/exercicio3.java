import java.util.Scanner;

// Ler 2 valores inteiros e mostrar qual e o maior. Se forem iguais, informar.
public class exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int v1 = sc.nextInt();

		System.out.print("Digite o segundo valor: ");
		int v2 = sc.nextInt();

		if (v1 > v2) {
			System.out.println("O maior valor e: " + v1);
		} else if (v2 > v1) {
			System.out.println("O maior valor e: " + v2);
		} else {
			System.out.println("Os valores sao iguais.");
		}

		sc.close();
	}
}
