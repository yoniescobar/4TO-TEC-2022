
package ejerciciodowhile;

import java.util.Scanner;

public class EjercicioDoWhile {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      char opcion;
      
            do{
                System.out.println("\n  M E N U   P R I N C I P A L");
                System.out.println("1. Opcion A");
                System.out.println("2. Opcion B");
                System.out.println("3. Opcion C");
                System.out.println("4. Salir");
                System.out.print("Ingrese una Opcion: ");
                opcion = entrada.next().charAt(0); //para leer una letra
                System.out.println(""); //salto de linea
                switch(opcion){
                    case '1': System.out.println("Bienvenidos a la Opcion A");
                    break;
                    case '2': System.out.println("Bienvenidos a la Opcion B");
                    break;
                    case '3': System.out.println("Bienvenidos a la Opcion C");
                    break;
                    
                    case '4': System.out.println("Hasta pronto!!!");
                    break;
                    
                    default: System.out.println("Haz presionado un opcion no Valida");
                    
                }
                
            }while(opcion!='4');
                    
                    
        
    }
    
}
