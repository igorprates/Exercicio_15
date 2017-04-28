
package exercicio;

import java.util.Scanner;


public class Exercicio4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();
        
        if (numero % 2 == 0){
            System.out.println("O seu número é par !");
        }
        
        else {
            System.out.println("O seu número é impar !");
    }
    
}
}
