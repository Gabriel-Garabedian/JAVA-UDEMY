import java.util.Locale;
import java.util.Scanner;
public class EscocoInicializacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in). useLocale(Locale.US);

        // double price = 200.00;
        // System.out.println(price);

        // NO COIGO ACIMA A VARIAVEL FOI (INICIALIZADA) POR ISSO RODOU 

//======================================================================================================//
        
        // double price;
        // System.out.println(price);

        //NO CODIGO ACIMA A VARIAVEL NAO FOI (INICIADA) POR ISSO DA ERRO

//======================================================================================================//

        // double price = 200.00;
        // if (price <100.00){
        //     double desconto = price *0.01;
        // }
        // System.out.println(desconto);

        //NO CODIGO ACIMA A VARIAVEL (desconto) NAO FOI (INICIADA) POR ISSO DA ERRO

//======================================================================================================//        

         double price = 200.00;
         double desconto= 0;
        if (price <100.00){
            desconto = price *0.01;
        }
        System.out.println(desconto);

        //NO CODIGO ACIMA, ESTÁ CORRETO POIS A VARIAVEL (desconto)  FOI INICIALIZADA


        sc.close();
    }
}
