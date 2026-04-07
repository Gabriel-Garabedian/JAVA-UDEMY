
import java.util.Locale;
import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        // (condição) ? valor_se_verdadeiro : valor_se_falso 
        //exemplo1: (2>4) ? 50:80 --> 80
        //exemplo2: (10 != 3) ? "maria": "alex" --> maria

        // double preco = sc.nextDouble();
        // double desconto;

        // if (preco <20.00){
        //     desconto = preco *0.1;
        // }
        // else{
        //     desconto = preco*0.05;
        // }
        //======================================================================================//
        
        double preco = sc.nextDouble();
        double desconto = (preco < 20.00) ? preco*0.1 : preco*0.05;

        System.out.println("desconto é de "+ desconto);




        sc.close();
    }
}