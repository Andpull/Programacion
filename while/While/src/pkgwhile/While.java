/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto= new Scanner(System.in);
        System.out.println("Captura un valor");
        
        int n=objeto.nextInt();
        int i=1;
        System.out.println("Primeros" +n+ "numeros naturales");
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
    
}
