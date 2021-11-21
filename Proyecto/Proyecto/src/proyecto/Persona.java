/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;



/**
 *
 * @author LENOVO
 */

import java.util.Scanner;

   public class Persona {
   private int Id;
   private String Nombre;
   private String Apellido;
   private int Cedula;
   private int Edad;
   
   Scanner leer=new Scanner(System.in);
   
   public void mostrarDatos() {
       System.out.println("Este es su Id: " + Id);
       System.out.println("Su nombre es: " + Nombre);
       System.out.println("Su apellido es: " + Apellido);
       System.out.println("Su numero de cedula es: " + Cedula);
       System.out.println("Su edad es: " + Edad);
   }
   public void ingresarDatos() {
       System.out.println("Ingrese el Id");
       Id= leer.nextInt();
       System.out.println("Ingrese el nombre");
       Nombre= leer.nextLine();
       System.out.println("Ingrese el Apellido");
       Apellido= leer.nextLine();
       System.out.println("Ingrese el numero de cedula");
       Cedula= leer.nextInt();
       System.out.println("Ingrese su Edad");
       Edad= leer.nextInt();
   }
   }
   

