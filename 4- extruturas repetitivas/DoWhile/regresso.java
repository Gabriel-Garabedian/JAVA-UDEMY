package DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class regresso {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Criar um programa que conte de 5 até 1 e depois exiba uma mensagem

        int contador = 5;

        do {
            System.out.println(contador);
            contador--; // Diminui o contador em 1 a cada rodada
        } while (contador > 0);

        System.out.println("Fogo!");
        
        sc.close();
    }
}