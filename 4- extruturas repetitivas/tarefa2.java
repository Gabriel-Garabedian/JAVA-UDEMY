import java.util.Scanner;
import java.util.Locale;

public class tarefa2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (true){
            if (x == 0 || y == 0){
                break;
            }
            else if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();

        }

        sc.close();
    }
    
}
