
package billetesdenominacion;

import java.util.Scanner;

public class BilletesDenominacion {

    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
        int cantidad, b200,b100,b50,b20,b10,b5,b1;  //1. reservar variables
        
        System.out.print("Ingrese un cantidad: ");  
        cantidad = entrada.nextInt();   //2. ingresar datos  438
        
        //3. hacer calculos
        b200 = cantidad /200;  // 2
        cantidad = cantidad % 200; //38
        b100 = cantidad /100; //0
        cantidad = cantidad % 100;
        b50 = cantidad /50;
        cantidad = cantidad % 50;
        b20 = cantidad /20;
        cantidad = cantidad % 20;
        b10 = cantidad / 10;
        cantidad = cantidad % 10; 
        b5 = cantidad / 5;
        cantidad = cantidad % 5; 
        b1 = cantidad;
        
        System.out.println("Billetes de Q.200: "+b200);
        System.out.println("Billetes de Q.100: "+b100);
        System.out.println("Billetes de Q.50: "+b50);
        System.out.println("Billetes de Q.20: "+b20);
        System.out.println("Billetes de Q.10: "+b10);
        System.out.println("Billetes de Q.5: "+b5);
        System.out.println("Billetes de Q.1: "+b1);
  
    }
    
}
