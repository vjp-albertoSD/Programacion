/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26t2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio26T2 {

  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Introduzca un numero de 4 cifras: ");
          int numeroGrande = sc.nextInt();
          
          int primeraCifra = numeroGrande / 1000;
          int segundaCifra = (numeroGrande / 100) % 10;
          int terceraCifra = (numeroGrande / 10) % 10;
          int cuartaCifra = numeroGrande % 10;
        
          System.out.println("La primera cifra es: " + primeraCifra);
          System.out.println("La segunda cifra es: " + segundaCifra);
          System.out.println("La tercera cifra es: " + terceraCifra);
          System.out.println("La cuarta cifra es: " + cuartaCifra);
          System.out.println("MAGIA");
        
    }
    
}
