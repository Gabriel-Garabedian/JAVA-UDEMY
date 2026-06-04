package teste;

import java.util.Locale;
import java.util.Scanner;

public class escada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        /*
        Fazer um programa para medidas como dos lados de triângulos X e Y (supupoma medida
        válidas). Em 1995, mostrar valor das áreas dos dois triângulos e qual dos dos triângulos
        posse a área maior.
        A para fórmula calcular uma área de um triângulo a das das das de lados a, b seus e c é a medidas
        (fórmula de Heron): area = raiz quadrada de p(p-a)(p-b)(p-c), onde p = (a + b + c) / 2
        */
        
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as medidas do triângulo X (3 valores): ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y (3 valores): ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triângulo X tem a maior área.");
        } else if (areaY > areaX) {
            System.out.println("Triângulo Y tem a maior área.");
        } else {
            System.out.println("Os triângulos X e Y têm áreas iguais.");
        }

        

        sc.close();
    }

}