
package programahacersencillo;

import java.util.Scanner;


public class ProgramaHacerSencillo {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        int cantidad, b200,b100,b50,b20,b10,b5,b1;
        
        System.out.print("Ingrese una Cantidad Q. ");
        cantidad = entrada.nextInt();
        
        b200 = cantidad/200;
        cantidad = cantidad % 200;
        b100  = cantidad/100;
        cantidad = cantidad % 100;
        b50  = cantidad/50;
        cantidad = cantidad % 50;
        b20  = cantidad/20;
        cantidad = cantidad % 20;
        b10  = cantidad/10;
        cantidad = cantidad % 10;
        b5  = cantidad/5;
        cantidad = cantidad % 5;
        b1  = cantidad;
       
   
        
       System.out.println("Billetes de 200 Q. "+b200);
       System.out.println("Billetes de 100 Q. "+b100);
       System.out.println("Billetes de 50  Q. "+b50);
       System.out.println("Billetes de 20  Q. "+b20);
       System.out.println("Billetes de 10  Q. "+b10);
       System.out.println("Billetes de 5   Q. "+b5);
       System.out.println("Billetes de 1   Q. "+b1);
        
        
        
        
        
    }
    
}
