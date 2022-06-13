
package javaapplication96;

import java.util.Scanner;


public class JavaApplication96 {

    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        
        int carnet = 2015010204;
        int anio, facultad, carrera,sede;
        
        /*
         2015
         01
         02
         04
        
        */
        
        anio = carnet /1000000;    
        carnet = carnet /1000000;
        facultad = carnet/100000;
        
        System.out.println(anio);
      
        
    }
    
}
