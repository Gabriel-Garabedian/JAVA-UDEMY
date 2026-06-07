package While;

import java.util.Locale;
import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        
Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos e espaços em branco. Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20. usando while 
        */

        System.out.println("Entre com o tamanho do lado do quadrado (entre 1 e 20): ");

        int n = sc.nextInt();

        if (n < 1 || n > 20){  // validação do tamanho do lado do quadrado
            System.out.println("Tamanho inválido. O tamanho deve ser entre 1 e 20.");
        } else {
            int i =1;
            while (i<=n){ // linha
                int j =1;
                while (j<= n){  // coluna
                    if (i ==1 || i == n || j == 1 || j ==n){  // borda do quadrado
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    
        
        
        sc.close();
    }
}