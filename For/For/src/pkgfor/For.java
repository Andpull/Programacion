/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int contar;
        
        System.out.println("Ingrese la cantidad de numeros: ");
        contar= entrada.nextInt();
        
        for(int i=2; i<=contar; i+=2){
            System.out.println(i);
        }
    }
    
}
