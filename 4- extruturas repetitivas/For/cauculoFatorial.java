package For;
import java.util.Locale;
import java.util.Scanner;

public class cauculoFatorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Peça para o usuário digitar um número inteiro positivo e calcule o seu fatorial. O fatorial de 5, por exemplo, é 5x4x3x2x1 = 120\).

        System.out.println("Digite um número inteiro positivo: ");

        int numero = sc.nextInt();
        int fatorial = 1;
        for (int i =1; i <= numero; i++){
            fatorial *= i ;
        }
    System.out.println("Fatorial de " + numero + " é: "+ fatorial);

        sc.close();
    }
}