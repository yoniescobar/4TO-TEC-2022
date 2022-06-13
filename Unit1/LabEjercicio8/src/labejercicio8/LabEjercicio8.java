
package labejercicio8;

import java.util.Scanner;

public class LabEjercicio8 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      float cantidad = 783.75f;
      float b200,b100,b50,b20,b10,b5,b1,b050,b025,b010,b005,b001;
      
      b200 = (int) cantidad / 200;
      cantidad = cantidad - (b200 * 200); //resto
      b100 = (int)cantidad/100;
      cantidad = cantidad - (b100 * 100); //resto
      b50 = (int)cantidad/50;
      cantidad = cantidad - (b50 * 50); //resto
      b20 = (int) cantidad/20;
      cantidad = cantidad - (b20 * 20); //resto
      b10 = (int)cantidad/10;
      cantidad = cantidad - (b10 * 10); //resto
      b5 =(int) cantidad/5;
      cantidad = cantidad - (b5 * 5); //resto
      b1 =(int) cantidad/1;
      cantidad = cantidad - (b1 * 1); //resto
        System.out.println("......."+cantidad);
      
      b050 =  cantidad - ;
      System.out.println("......."+b050);
      
      
      cantidad = cantidad - (b050 * 0.50f); //resto
      
      b025 = (int) cantidad/0.25f;
      cantidad = cantidad - (b025 * 0.25f); //resto
     
      
      
        System.out.println("Billetes de Q. 200: "+b200);
        System.out.println("Billetes de Q. 100: "+b100);
        System.out.println("Billetes de Q. 50: "+b50);
        System.out.println("Billetes de Q. 20: "+b20);
        System.out.println("Billetes de Q. 10: "+b10);
        System.out.println("Billetes de Q. 5: "+b5);
        System.out.println("Billetes de Q. 1: "+b1);
        System.out.println("Billetes de Q. 0.50: "+b050);
        System.out.println("Billetes de Q. 0.25: "+(7%5.5));
      
        
        
    }
    
}
