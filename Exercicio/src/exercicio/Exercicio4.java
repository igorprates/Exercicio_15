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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        double numero = sc.nextDouble();
        
        if (numero % 2 == 0){
            System.out.println("Seu número é par !!!");
        }
        
        else {
            System.out.println("Seu número é impar !!!");
    }
    
}
}