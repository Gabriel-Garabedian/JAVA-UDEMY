package For;

import java.util.Locale;
import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Escreva um programa que exiba apenas os números pares na faixa de 1 a 20.
        
        for (int i = 1; i<=20; i++){
            if (i %2 == 0){
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}