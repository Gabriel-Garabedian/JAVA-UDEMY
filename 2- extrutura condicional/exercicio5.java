import java.util.Scanner;

// Ler 3 valores inteiros e verificar se eles podem formar um triangulo. Se sim, informar o tipo:
// Equilatero, Isosceles ou Escaleno.
public class exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o lado A: ");
		int a = sc.nextInt();

		System.out.print("Digite o lado B: ");
		int b = sc.nextInt();

		System.out.print("Digite o lado C: ");
		int c = sc.nextInt();

		if (a < b + c && b < a + c && c < a + b) {
			// E um triangulo valido
			if (a == b && b == c) {
				System.out.println("Triangulo EQUILATERO");
			} else if (a != b && a != c && b != c) {
				System.out.println("Triangulo ESCALENO");
			} else {
				System.out.println("Triangulo ISOSCELES");
			}
		} else {
			System.out.println("Os valores nao formam um triangulo.");
		}

		sc.close();
	}
}
