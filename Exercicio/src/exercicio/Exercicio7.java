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
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota ;
	float total = 0;
	int quantidade = 0;
        
        
        do{
            System.out.println("Informe a nota: ");
            
            nota = sc.nextFloat();
        
            if (nota != -1) {
		total += nota;
		quantidade++;
            }
            
        } while(nota != -1);
        
        float media = (total/quantidade);
        System.out.println("A sua média é " + media );
    }
    
}
