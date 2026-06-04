package For;

import java.util.Locale;
import java.util.Scanner;

public class contagemRegresiva {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Crie um programa que faça uma contagem regressiva de 10 até 0 e, no final, exiba a mensagem.

        for (int i = 10; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("HEXAAAAAAAAAA CAMPEÃOOOOOO");
        
        sc.close();
    }
}