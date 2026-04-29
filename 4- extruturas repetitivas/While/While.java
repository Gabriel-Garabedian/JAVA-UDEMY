package While;
import java.util.Locale;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in). useLocale(Locale.US);
        
        //WHILE == ENQUANTO

        // while (contição){        REGRA:
        //     comando 1            V: EXECULTA E VOLTA
        //     comando 2            F: PULA FORA 
        // }

        //RECOMENDADA PARA QUANDO NÃO SE SABE O NÚMERO DE REPETIÇÕES

        int x = sc.nextInt();
        int soma = 0;
        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }
        System.out.println("SOMA: " + soma);

        sc.close();
    }
    
}
