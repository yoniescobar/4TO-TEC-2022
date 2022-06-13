
package lab3.ejercicio5;

import java.util.Scanner;

public class Lab3Ejercicio5 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        String nombre1,nombre2,op1,op2;
      
       //Ingreso de datos del Primer Jugador
        System.out.print("Digite Nombre del Jugador 1: ");
        nombre1 = entrada.nextLine();
        System.out.print("Digite Eleccion de "+nombre1+": ");
        op1 = entrada.nextLine(); //papel
        
        //Ingreso de datos del Segundo Jugador
        System.out.println("---------------------------------");
        System.out.print("Digite Nombre del Jugador 2: ");
        nombre2 = entrada.nextLine();
        System.out.print("Digite Eleccion de "+nombre2+": ");
        op2 = entrada.nextLine();
        
         System.out.println("\n---------------------------------");
         
         //evaluación de resultado
         
         if(op1.equals("papel") && (op2.equals("piedra")) || 
            op1.equals("piedra") && (op2.equals("tijera")) || 
            op1.equals("tijera") && (op2.equals("papel"))){
             
             System.out.println("El Ganador es: "+nombre1);
             
         }else if(op1.equals("papel") && (op2.equals("papel")) || 
            op1.equals("piedra") && (op2.equals("piedra")) || 
            op1.equals("tijera") && (op2.equals("tijera"))){
             
             System.out.println("Hay un Empate!!!");
         }else{
              System.out.println("El Ganador es: "+nombre2);
         }
         
                  
      
    }
    
}
