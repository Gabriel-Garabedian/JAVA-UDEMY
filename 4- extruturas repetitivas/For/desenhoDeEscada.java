package For;

import java.util.Locale;
import java.util.Scanner;

public class desenhoDeEscada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Imprima uma "escada" de asteriscos na tela usando um for aninhado (um laço dentro do outro). O programa deve pedir a altura da escada.

        System.out.print("Digite a altura da escada: ");
        int altura = sc.nextInt();

        for(int i =1; i<=altura; i++){ // O número de linhas da escada é igual à altura digitada pelo usuário
            for(int j=1; j<=i; j++){ // O número de asteriscos em cada linha é igual ao número da linha (i)
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}
