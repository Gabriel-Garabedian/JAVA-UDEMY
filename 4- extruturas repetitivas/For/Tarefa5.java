package For;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa5{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int fatorial = 1;

        for (int i = valor; i>=1; i--){
            fatorial *= i;
        }
        System.out.println(fatorial);

        sc.close();
    }
}
