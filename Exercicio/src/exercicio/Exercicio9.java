
package exercicio;

import java.util.Scanner;


public class Exercicio9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o numero da matriz: ");
        int matriz = sc.nextInt();

        for (int i = 0; i < matriz + 1; i++) {

            for (int v = 0; v < matriz; v++) {
                System.out.println("|" + v + "|" + i + "|");
            }

        }
    }
    
}
