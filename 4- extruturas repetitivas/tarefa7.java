import java.util.Scanner;
import java.util.Locale;

public class tarefa7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int carro = 0;
        int moto = 0;
        int caminhao = 0;

        while (true){
            int tipo = sc.nextInt();

            if (tipo == 1){
                carro++;
            }
            else if (tipo == 2){
                moto++;
            }
            else if (tipo == 3){
                caminhao++;
            }
            else if (tipo == 4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Carros: " + carro);
                System.out.println("Motos: " + moto);
                System.out.println("Caminhões: " + caminhao);
                break;
            }
        }
        
        sc.close();
    }

}

