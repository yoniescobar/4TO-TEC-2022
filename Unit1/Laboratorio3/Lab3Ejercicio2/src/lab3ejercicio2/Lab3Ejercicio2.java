
package lab3ejercicio2;

import java.util.Scanner;

public class Lab3Ejercicio2 {

    public static void main(String[] args) {
         //Esta linea es para crear un objeto de ingreso de datos
       Scanner entrada = new Scanner(System.in);
       
       int numero,cm,dm,um,centenas,decenas,unidades;  //declarando un valor entero
       
       System.out.print("Ingrese un numero de 6 digitos: "); 
       numero = entrada.nextInt();   //ingreso de datos  157831
        
        //procesos
        cm = numero/100000; //resutado 1
        numero = numero % 100000; //sobrea 5781
        dm = numero / 10000;     // resultado 5
        numero = numero % 10000; // sobra 7831
        um = numero / 1000;      // resultado 7
        numero = numero % 1000; // sobra 831
        centenas = numero/100;   //resultado 1
        numero = numero % 100; // sobra 31
        decenas = numero / 10;  // resultado 3
        numero = numero % 10; // sobra 1
        unidades = numero;
        
        if(cm % 2==0){  //validando el primer numero  cententas de millar cm
            System.out.println("Numero Par: "+cm);
        }else if(cm % 2!=0){
            System.out.println("Numero Impar: "+cm);
        }else{
            System.out.println("Numero Cero: "+cm);
        }
        
         if(dm % 2==0){  //validando el segundo numero  decenas de millar dm
            System.out.println("Numero Par: "+dm);
        }else if(dm % 2!=0){
            System.out.println("Numero Impar: "+dm);
        }else{
            System.out.println("Numero Cero: "+dm);
        }
       
          if(um % 2==0){  //validando el segundo numero  unidades de millar um
            System.out.println("Numero Par: "+um);
        }else if(um % 2!=0){
            System.out.println("Numero Impar: "+um);
        }else{
            System.out.println("Numero Cero: "+um);
        }
       
         if(centenas % 2!=0){  //validando el tercer numero  centenas cm
         System.out.println("Numero Impar: "+centenas);
        }else if(centenas==0){
            System.out.println("Numero Cero: "+centenas);
        }else{
            System.out.println("Numero Par: "+centenas);
        }
         
          if(decenas % 2==0){  //validando el tercer numero  centenas cm
         System.out.println("Numero Par: "+decenas);
        }else if(cm % 2!=0){
            System.out.println("Numero Impar: "+decenas);
        }else{
            System.out.println("Numero Cero: "+decenas);
        }
       
       
       
       if(unidades % 2==0){  //validando el primer numero  unidades
         System.out.println("Numero Par: "+unidades);
        }else if(unidades % 2!=0){
            System.out.println("Numero Impar: "+unidades);
        }else{
            System.out.println("Numero Cero: "+unidades);
        }
          
                
    }
    
}
