package For;

import java.util.Locale;
import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //1. Contador de 1 a 10

        for (int i =1; i<=10; i++){
            System.out.println(i);
        }
        
        
        sc.close();
    }
}
