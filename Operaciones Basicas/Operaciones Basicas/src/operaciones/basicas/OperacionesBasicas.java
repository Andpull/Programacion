/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.basicas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        System.out.println("Soy Mauricio");
    
    sumaOperacion();
    restaOperacion();
    multiplicacionOperacion();
    divisionOperacion();
    raizOperacion();
    potOperacion();
    ejemScanner();
    }
    public static void sumaOperacion () {
    System.out.println("esta es mi suma");
    
        int  Num1 =  5;
        int  Num2 = 5;
        int  resp = Num1 + Num2;
        System.out.println(resp);
        System.out.println("El resultado de la suma es : " + resp );
    
    }
    public  static void restaOperacion() {
    System.out.println("Esta es mi resta");
        int Num1= 5;
        int Num2= 2;
        int resp= Num1 - Num2;
        System.out.println(resp);
        System.out.println("El resultado de la resta es : " + resp);
    }
    public static void multiplicacionOperacion() {
         int Num1= 8;
        int Num2= 2;
        int resp= Num1 * Num2;
        System.out.println(resp);
        System.out.println("El resultado de mi multiplicacion es: " + resp);
    }
    public static void divisionOperacion () {
        int Num1= 8;
        int Num2= 2;
        int resp= Num1 / Num2;
        System.out.println(resp);
        System.out.println("El resultado de mi division es: " + resp);
    }
    public static void raizOperacion () {
        int Num1=16;
        double resp=Math.sqrt(Num1);
        System.out.println(resp);
        System.out.println("El resultado de mi reiz es: " + resp);
    }
    public static void potOperacion () {
        double Num1 = 2;
        double Num2 = 4;
        double resp;
        resp = Math.pow(Num1,Num2);
        System.out.println(resp);
        System.out.println("La respuesta de mi potencia es: " + resp);
    }
    public static void ejemScanner() {
        System.out.println("Ingrese el nombre del usuario");
        Scanner leer = new Scanner (System.in);
        var usuario = leer.nextLine();
        System.out.println("usuario " +usuario);
        
        System.out.println("Ingrese Nombre Copleto");
        var Nombre = leer.nextLine();
        System.out.println("Nombre Compelto " + Nombre);
        
        System.out.println("Ingrese la edad del usuario");
        var Edad = leer.nextLine();
        System.out.println("Edad: " + Edad);
        
        System.out.println("Ingrese su Genero");
        var Genero = leer.nextLine();
        System.out.println("Genero: " + Genero);
        
        System.out.println("Ingrese su fecha de nacimiento");
        var fecha= leer.nextLine();
        System.out.println("fecha de nacimiento: " + fecha);
        
        System.out.println("Ingrese su correo electronico");
        var correo = leer.nextLine();
        System.out.println("correo: " + correo);
        
        System.out.println("Ingrese una Direccion");
        var Direccion = leer.nextLine();
        System.out.println("Direccion: " + Direccion);

    }
        
    
}
