
import java.util.Locale;
import java.util.Scanner;

public class FuncoesParaString {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // FORMATAR: 
            //toLowerCase() == TRANFORMAR PARA MINUSCULO

            String original = "ABACD FGHJ ABC adb DEFc";
            String s01 = original.toLowerCase();

            System.out.println("Original: -" + original + "-");
            System.out.println("tolowercase -" + s01 + "-");

            //toUpperCase() == TRANSFORMAR PARA MAIUSCULO
            String s02 = original.toUpperCase();
            System.out.println("touppercase - " + s02 + "-");

            //trim() == REMOVER ESPAÇOS EM BRANCOS
            String s03 = original.trim();
            System.out.println("trim - " + s03 + "-");

//======================================================================================================//

        // RECORTAR:
            //substring(inicio) == INFORMANDO INICIO
            String s04 =  original.substring(2);
            System.out.println("Substring(2) -" + s04 + "-");
            //pegar apenas o caractere 2 e mostrar o resto, excluindo os outros 2 de tras

            //substring(inicio, fim) == INFORMANDO INICIO E FIM
            String s05 = original.substring(2,9);
            System.out.println("Substring(2, 9) -" + s05 + "-");
            //Vai do caractere 2 ate o caractere 9, excluindo os outros da frente e de tras

//======================================================================================================//

        // SUBISTITUIR: subistiruir caractere ou substring

            //Replace(char, char) ('')
            String s06= original.replace('A', 'x');
            System.out.println("Replace('A', 'x') -" + s06 + "-");
            //Troca pra mim, toda vez que tu ver um "A" troca por "x" fazendo fazor 

            // Replace(string, string) ("")
            String s07= original.replace("AB", "kaka");
            System.out.println("Replace('AB', 'kaka') -" + s07 + "-");

//======================================================================================================//

        // BUSCAR: buscar uma posição de alguma parte do string 
            //IndexOf
            int i = original.indexOf("AB"); //PRIMEIRA OCORRENCIA
            System.out.println("IndexOf ('AB')"+ i); 
            // LastIndexOf
            int j = original.lastIndexOf("AB"); //ULTIUMA OCORRENCIA 
            System.out.println("LastIndexOf ('AB')"+ j);

//======================================================================================================//

        // str.Split("") == RECORTAR UM STRING COM BASE NO SEPARADOR QUE INFORMAR AQUI ("")

        String s = "potato apple lemon";
        String[] vect = s.split(" ");//AQUI O ESPAÇO (TECLA) TA SENDO CORTADO
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        sc.close();
    }
}