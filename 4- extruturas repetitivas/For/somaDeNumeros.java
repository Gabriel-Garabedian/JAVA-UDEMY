package For;
import java.util.Locale;
import java.util.Scanner;

public class somaDeNumeros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Crie um programa que peça para o usuário digitar 5 números inteiros. No final, exiba a soma total desses números.
        int soma = 0;
        for (int i =1; i<=5; i++){
            System.out.println("Digite o " + i + "º número: ");
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("Soma Total: " + soma);
        
        
        sc.close();
    }
}