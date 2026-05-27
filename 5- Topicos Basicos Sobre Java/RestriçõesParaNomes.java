import java.util.Locale;
import java.util.Scanner;

public class RestriçõesParaNomes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //nao usar acento
        //nao pode ter espaço em branco
        //nomes com significados 
        //nao usar numero no começo de variavel
        
        // Errado:
        // int 5minutes;
        // int salário;
        // int salario do funcionario;

        // Correto:
        // int _5minutes;
        // int salario;
        // int salarioDoFuncionario;
//====================================================================================================//

        //CONVENÇÕES

        // Camel Case: lastName - COMEÇAR COM LETRA MINISCULA
        // • pacotes
        // • atributos
        // • métodos
        // • variáveis e parâmetros

        // Pascal Case: ProductService - COMEÇAR COM MAIUSCULO
        // • classes


        sc.close();
    }
}