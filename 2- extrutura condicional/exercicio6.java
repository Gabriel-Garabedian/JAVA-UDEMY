import java.util.Scanner;

// Ler uma hora do dia (inteiro) e informar: BOM DIA, BOA TARDE ou BOA NOITE.
// 0-11: Bom dia, 12-17: Boa tarde, 18-23: Boa noite
public class exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora do dia (0-23): ");
		int hora = sc.nextInt();

		if (hora >= 0 && hora <= 11) {
			System.out.println("BOM DIA");
		} else if (hora >= 12 && hora <= 17) {
			System.out.println("BOA TARDE");
		} else if (hora >= 18 && hora <= 23) {
			System.out.println("BOA NOITE");
		} else {
			System.out.println("Hora invalida!");
		}

		sc.close();
	}
}
