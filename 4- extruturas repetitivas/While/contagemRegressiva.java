package While;

import java.util.Locale;
import java.util.Scanner;

public class contagemRegressiva {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Criar um programa que conte de 10 até 1 e, no final, exiba a mensagem "HEXAAAAAAA CAMPEÃOOOOOOOO".
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("HEXAAAAAAA CAMPEÃOOOOOOOO");

        sc.close();
    }
}