package DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //DO WHILE == FAÇA ENQUANTO 

        //SINTAXE// REGRA: V: volta | F: pula fora

        //GARANTIR QUE O CODIGO EXECULTE PELO MENOS 1 VEZ

        //O laço do-while é uma estrutura de repetição que garante que o bloco de código seja executado pelo menos uma vez, pois a condição é verificada após a execução do bloco.

//          Quando utilizar do-while

//   O do-while é mais apropriado quando:

//   1. Você precisa garantir que o bloco execute pelo menos uma vez
//   2. A condição de continuidade depende de valores definidos dentro do próprio bloco

//   Casos típicos de uso:
//   - Menus interativos
//   - Validação de entrada do usuário
//   - Jogos simples onde a lógica precisa rodar pelo menos uma vez

        
        // do{
        //     bloco de código a ser executado 
        // } while(condição);
        int idade;
    
        do{
            System.out.println("Digite sua idade:");
            idade = sc.nextInt();
            if (idade<0 || idade > 120) {
                System.out.println("idade inválida!");
            }else System.out.println("idade valida");

        }while(idade<0 || idade > 120);
        
        
        sc.close();
    }
}