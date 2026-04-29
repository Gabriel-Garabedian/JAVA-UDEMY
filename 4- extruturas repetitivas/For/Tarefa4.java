package For;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();
            if (denominador == 0){
                System.out.println("Divisao impossivel");
            } else {
                double resultado = (double) numerador / denominador;
                System.out.printf("%.2f%n", resultado);
            }

        }

        sc.close();
    }
}
