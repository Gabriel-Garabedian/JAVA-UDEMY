package For;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.

        System.out.print("Digite um número inteiro positivo: ");
        int N = sc.nextInt();

        for (int i =1; i<=N; i++){
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }

        sc.close();
    }
}
