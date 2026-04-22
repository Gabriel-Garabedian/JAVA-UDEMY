import java.util.Scanner;
import java.util.Locale;

public class tarefa6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Exercício 3 — Nota de alunos
        //   Leia a nota de vários alunos (0 a 100). Conte quantos foram aprovados (≥ 60) e reprovados. Encerre quando digitar -1.
        int aprovados = 0;
        int reprovados =0;

        while (true){
            int nota = sc.nextInt();

            
            if (nota == -1){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Aprovados: " + aprovados);
                System.out.println("Reprovados: " + reprovados);
                break;
            }
            else if (nota < 0 || nota > 100){
                // não faz nada
            }
            else if (nota >= 60){
                aprovados++;
            }
            else {
                reprovados++;
            }
        }


        


        sc.close();
    }

}

