/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadcla;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class eadadp {
    
    Scanner leer= new Scanner(System.in);
    int edad;
     public void ingresardatos (){
         System.out.println("Ingresa una edad");
         int edad= leer.nextInt();
     }
    public void mostardatos (){
        if (edad>=0 & edad<=11) {
            System.out.println("La edad ingresada es de un nuño");
        }
        else if (edad>=12 & edad<=18){
            System.out.println("La edad ingresada es de un adolescente");
        }
        else if (edad>=19 & edad<=30){
            System.out.println("La edad ingresada es de un joven");
        }
        else if (edad>=61 & edad<=64){
            System.out.println("La edad ingresada es de un adulto");
        }else if (edad>=65){
            System.out.println("La edad ingresada es de un adulto mayor");
        }
    }
   
}
