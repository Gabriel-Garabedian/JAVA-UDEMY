import java.util.Scanner;
import java.util.Locale;

public class tarefa5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
      int pizza = 0;
      int hamburger = 0;
      int salada = 0;

        while (true){
            int pedido = sc.nextInt();

            if (pedido == 1){
                pizza++;
            }
            else if (pedido == 2){
                hamburger++;
            }
            else if (pedido == 3){
                salada++;
            }
            else if (pedido == 4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Pizza: " + pizza);
                System.out.println("Hamburguer: " + hamburger);
                System.out.println("Salada: " + salada);
                break;
            }
        }

        sc.close();
    }

}
