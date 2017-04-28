
package exercicio;

import java.util.Scanner;


public class Exercicio7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota ;
	float total = 0;
	int quantidade = 0;
        
        
        do{
            System.out.println("Qual é a nota: ");
            
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
