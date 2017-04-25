/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Digite Seu nome: ");
        String nome = sc.next();
        
        System.out.println("Digite seu peso: ");
        float peso = sc.nextFloat();
        
        System.out.println("Digite seu tipo sanguineo (Sem o + ou -) : ");
        String tiposangue = sc.next();
        
        System.out.println("Digite sua data de aniversário: ");
        String data = sc.next();
        
        System.out.println("Digite o numero do seu sapato: ");
        int tamsapato = sc.nextInt();
        
        System.out.println("Casado? (S/N)");
        String casado = sc.next();
        
        System.out.println("-----------------------FICHA TÉCNICA-----------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Data de aniversário: " + data);
        System.out.println("Tipo sanguíneo : " + tiposangue);
        System.out.println("Peso: " + peso + " KG");
        System.out.println("Numero sapato:" + tamsapato);
        System.out.println("Casado: " + casado);
        System.out.println("-----------------------FIM FICHA TÉCNICA-----------------------");
        
        
    }
    
}