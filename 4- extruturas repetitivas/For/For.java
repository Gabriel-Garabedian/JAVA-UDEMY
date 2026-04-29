package For;
import java.util.Scanner;
import java.util.Locale;

public class For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//================================================================================================================================//

        // For == para
        //For é É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
        //Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores

//================================================================================================================================//
        
        //SINTAXE/REGRAS
        // for (inicio; condição; incremento){
        //     comando 1 
        //     comando 2
        // }

//================================================================================================================================//

    //INICIO: Execulta somante na primeira iteração, é onde se declara a variável de controle do laço, ou seja, a variável que irá controlar o número de repetições do laço.

    //CONDIÇÃO: É a expressão que é avaliada antes de cada iteração do laço. Se a condição for verdadeira, o bloco de comandos dentro do laço será executado. Se for falsa, o laço será encerrado e a execução continuará após o laço.

    //INCREMENTO: É a expressão que é executada após cada iteração do laço. Geralmente, é usada para atualizar a variável de controle, como incrementá-la ou decrementá-la.

//================================================================================================================================//

        // int n = sc.nextInt();

        // int soma = 0;
        // for (int i = 0; i<n; i++){
        //     int x = sc.nextInt();
        //     soma += x;
        // }

        // System.out.println(soma);

        for (int i=4; i>=0; i--) {
        System.out.println("Valor de i: " + i);
        }

        sc.close();
    }

    
}
