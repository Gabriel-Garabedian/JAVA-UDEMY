package While;
import java.util.Scanner;
import java.util.Locale;

public class tarefa3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true){
            int x = sc.nextInt();

            if (x==1){
                alcool++;
            }
            else if (x==2){
                gasolina++;
            }
            else if (x==3){
                diesel++;
            }
            else if (x==4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
                break;
            }
        


        }

        sc.close();
    }
}
