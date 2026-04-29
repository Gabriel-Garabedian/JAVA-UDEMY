package For;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dentro = 0;
        int fora = 0;
        
        for (int i = 0; i <n; i++){
            int valor = sc.nextInt();
            if (valor >= 10 && valor <= 20){
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        sc.close();
    }
}
