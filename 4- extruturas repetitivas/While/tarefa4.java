package While;
import java.util.Scanner;
import java.util.Locale;

public class tarefa4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int candidato1 =0;
        int candidato2 =0;
        int candidato3 =0;

        while (true){
            int voto = sc.nextInt();

            if (voto == 1){
                candidato1++;
            }
            else if (voto == 2){
                candidato2++;
            }
            else if (voto == 3){
                candidato3++;
            }
            else if (voto == 0){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Candidato 1: " + candidato1);
                System.out.println("Candidato 2: " + candidato2);
                System.out.println("Candidato 3: " + candidato3);
                break;
            }
        }


        sc.close();
    }

}
