
package exercicio;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é sua Idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Qual é Seu nome: ");
        String nome = sc.next();
        
        System.out.println("Qual é seu peso: ");
        float peso = sc.nextFloat();
        
        System.out.println("Qual é o seu tipo sanguineo (Sem o + ou -) : ");
        String tiposangue = sc.next();
        
        System.out.println("Qual é sua data de aniversário: ");
        String data = sc.next();
        
        System.out.println("Qual é o numero do seu sapato: ");
        int tamsapato = sc.nextInt();
        
        System.out.println("Casado? (S/N)");
        String casado = sc.next();
        
       
        System.out.println("Seu nome: " + nome);
        
        System.out.println("Sua idade: " + idade);
        
        System.out.println("Data de aniversário: " + data);
        
        System.out.println("Tipo sanguíneo : " + tiposangue);
        
        System.out.println("Peso: " + peso + " KG");
        
        System.out.println("Numero sapato:" + tamsapato);
        
        System.out.println("Casado: " + casado);
        
        
        
    }
    
}
