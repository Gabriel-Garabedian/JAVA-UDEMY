import java.util.Locale;
import java.util.Scanner;

public class OperadoresAtribuicaoCumulativa {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);

      // a += b; == | a = a+b;
      // a -= b == | a = a-b;
      // a *= b == | a = a*b;
      // a /= b == | a = a/b;
      // a %= b == | a = a%b;

      int minutos = sc.nextInt();
      double conta = 50.00;
      

      if (minutos > 100){
        // conta = conta +(minutos -100) *2.0;
        conta += (minutos -100) *2.0;
      }

      System.out.printf("Valor da conta = R$ %.2f%n", conta );
      sc.close();
    }
}
