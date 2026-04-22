import java.util.Locale;
import java.util.Scanner;
public class Tarefa1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int senha = 2009;

        while (x != senha) {
            System.out.println("Senha Invalida, tente novamente!");
            x = sc.nextInt();
        }
        System.out.println("Acesso Permitido");


        sc.close();
    }
    
}
