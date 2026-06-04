package For;

import java.util.Locale;
import java.util.Scanner;

public class tabuadaDeUmNumero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Peça para o usuário digitar um número inteiro e exiba a tabuada desse número (de 1 a 10).

        int numero = sc.nextInt();
        for (int i = 1; i<=10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        
        sc.close();
    }
}