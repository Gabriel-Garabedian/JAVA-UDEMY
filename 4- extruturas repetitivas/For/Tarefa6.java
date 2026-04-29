package For;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Ler um número inteiro N e calcular todos os seus divisores.

       int N = sc.nextInt();
         for (int i = 1; i <= N; i++) {
              if (N % i == 0) {
                System.out.println(i);
              }
            }

        sc.close();
    }
}
