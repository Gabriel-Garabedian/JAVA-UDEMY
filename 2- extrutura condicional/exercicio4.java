import java.util.Scanner;

// Ler um caracter e informar se e VOGAL ou CONSOANTE.
public class exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		char letra = sc.nextLine().toLowerCase().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("VOGAL");
		} else if (letra >= 'a' && letra <= 'z') {
			System.out.println("CONSOANTE");
		} else {
			System.out.println("Caracter invalido.");
		}

		sc.close();
	}
}
