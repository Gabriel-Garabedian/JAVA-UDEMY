package While;
import java.util.Locale;
import java.util.Scanner;

public class senhas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /*
        Simule um sistema usando while que pede uma senha para o usuário. Enquanto ele digitar a senha errada, o programa deve dizer "Senha Incorreta. Tente novamente:". Quando ele acertar, o programa diz "Acesso Permitido!".
        */

        String senhaCorreta = "123456";
        String senhaDigitada = "";
        while (!senhaDigitada.equals(senhaCorreta)){
            System.out.println("Digite a senha: ");
            senhaDigitada = sc.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)){
                System.out.println("Senha Incorreta. Tente novamente: ");
            }
        }


        
        
        sc.close();
    }
}