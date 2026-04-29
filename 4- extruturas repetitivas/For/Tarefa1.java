package For;

import java.util.Scanner;
import java.util.Locale;

public class Tarefa1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        for (int i = 1; i <= valor; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
