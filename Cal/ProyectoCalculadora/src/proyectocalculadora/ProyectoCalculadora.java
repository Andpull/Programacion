/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

/**
 *
 * @author LENOVO
 */
public class ProyectoCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Calculadora miCalculadora = new Calculadora(5,4);
        //aqui el 10 se pasa al operando 1 y el 2 al operando 2
        
        int suma = miCalculadora.sumar();
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + miCalculadora.resta());
        System.out.println("La multiplicacion es: " + miCalculadora.multiplicar());
        System.out.println("La division es: " + miCalculadora.dividir());
        
    }
    
}
