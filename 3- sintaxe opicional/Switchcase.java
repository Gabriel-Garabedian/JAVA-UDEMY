import java.util.Locale;
import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        // DESSE JEITO AQUI VC SUBISTITUI O (IF) E (ELSE IF) 
        // O (switch) ele ler o valor e o (case) é caso o valor seja esse imprime ou slava alguma coisa. e depois de cada (case) ou (default) se usa um (break)

        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";  
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido!";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}    