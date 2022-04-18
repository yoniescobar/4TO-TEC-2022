
package lab3ejercicio1;

import java.util.Scanner;

public class Lab3Ejercicio1 {

    public static void main(String[] args) {
       //Esta linea es para crear un objeto de ingreso de datos
       Scanner entrada = new Scanner(System.in);
       
       int numero,dm,um,centenas,decenas,unidades;  //declarando un valor entero
       
       System.out.print("Ingrese un numero de 5 digitos: "); 
       numero = entrada.nextInt();   //ingreso de datos  57831
        
        //procesos
        dm = numero / 10000;     // resultado 5
        numero = numero % 10000; // sobra 7831
        um = numero / 1000;      // resultado 7
        numero = numero % 1000; // sobra 831
        centenas = numero/100;   //resultado 1
        numero = numero % 100; // sobra 31
        decenas = numero / 10;  // resultado 3
        numero = numero % 10; // sobra 1
        unidades = numero;
        
        System.out.println(unidades+""+decenas+""+centenas+""+um+""+dm);
                
        
        
    }
    
}
