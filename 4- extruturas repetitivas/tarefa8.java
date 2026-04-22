import java.util.Scanner;
import java.util.Locale;

public class tarefa8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        int manha = 0;
        int tarde = 0;
        int noite = 0;

        while (true){
            int x = sc.nextInt();

            if (x == 1){
                manha++;
            }
            else if (x == 2){
                tarde++;
            }
            else if (x == 3){
                noite++;
            }
            else if (x == 4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Manha: " + manha);
                System.out.println("Tarde: " + tarde);
                System.out.println("Noite: " + noite);
                break;
            }
        }
        
        sc.close();
    }

}

