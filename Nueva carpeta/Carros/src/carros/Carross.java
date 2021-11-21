/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
   
    public class Carross {
    private int Placa;
    private String Modelo;
    private String Color;
    private int Año;
    private String Marca;
        
    Scanner leer=new Scanner(System.in);
        
    public void mostrarDatos(){
        System.out.println("Este es el su numero de placa: " + Placa);
        System.out.println("Este es el modelo de su vehiculo: " + Modelo);
        System.out.println("Este es el color de su vehiculo: " + Color);
        System.out.println("Este es el año de su vehiculo: " + Año);
        System.out.println("Esta es la marca de su vehiculo: " + Marca);
        
    }
    public void ingresarDatos(){
        System.out.println("Ingrese el numero de placa");
        Placa= leer.nextInt();
        System.out.println("Ingrese el modelo de su vehiculo");
        Modelo= leer.nextLine();
        System.out.println("Ingrese el color de su vehiculo");
        Color= leer.nextLine();
        System.out.println("Ingrese el año de su vehiculo");
        Año= leer.nextInt();
        System.out.println("Ingrese el la marca de su vehiculo");
        Marca= leer.nextLine();
    }
                
}
