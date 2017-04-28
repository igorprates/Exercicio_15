
package exercicio;

import java.util.Scanner;


public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media ;
        
        System.out.println("Qual é a primeira nota: ");
        float pnota = sc.nextFloat();
        
        System.out.println("Qual é a segunda nota ");
        float snota = sc.nextFloat();
        
        media = ((pnota+snota)/2);
        
        if (media >= 6){
            System.out.println("Aluno está aprovado !");
        }
        else{
            System.out.println("Aluno está reprovado !");
        }
        System.out.println("Sua média é : " + media);
    }
    
}
