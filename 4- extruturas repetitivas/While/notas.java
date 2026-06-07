package While;

import java.util.Locale;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
        // Em seguida, através de um laço while, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez. Por fim, o programa mostra a média, aritmética, da turma.

        System.out.println("Quantos alunos tem na sala? ");

        int n = sc.nextInt();
        int i = 1;

        double soma =0.0;

        while (i <= n){
            System.out.println("Entre com a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            soma += nota;
            i++;
        }
        double media = soma / n;
        System.out.printf("A média da turma é: %.2f%n", media);
        

        
        sc.close();
    }
}