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
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          float hipotenusa ;
        float rhipotenusa ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro cateto: ");
        float pcat = sc.nextFloat();
        
        System.out.println("Informe o primeiro cateto: ");
        float scat = sc.nextFloat();
        
        hipotenusa =  ((float) Math.pow(pcat, 2) + (float) Math.pow(scat, 2)) ;
        rhipotenusa = (float)Math.pow(hipotenusa, (1.0/2));
        
        System.out.println("O valor da hipotenusa é :" + rhipotenusa);
    }
    
}
