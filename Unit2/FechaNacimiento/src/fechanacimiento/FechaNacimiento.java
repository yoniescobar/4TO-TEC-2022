
package fechanacimiento;

import java.util.Scanner;

public class FechaNacimiento {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        int anioActual=2022,mesActual=03,diaActual=17;
        int anioNac,mesNac,diaNac;
        int edadAnios,edadMeses,edadDias;
        
        
        System.out.print("Ingrese dia de nacimiento: ");
        diaNac = entrada.nextInt();
        System.out.print("Ingrese mes de nacimiento: ");
        mesNac = entrada.nextInt();
        System.out.print("Ingrese año de nacimiento: ");
        anioNac = entrada.nextInt();
       
        edadAnios = anioActual - anioNac; //2022- 1990 = 32
        edadMeses = mesActual - mesNac;   //2 - 5 = -3
        edadDias  = diaActual - diaNac;   //21 - 15 = 6
        
        if(edadDias<0){
            edadMeses = edadMeses - 1;
            edadDias = edadDias + 30;
        }
        if(edadMeses<0){
            edadAnios = edadAnios -1;
            edadMeses = edadMeses + 12;
        }
        
        System.out.println("Usted tiene: "+edadAnios+" años "+edadMeses+" Meses "+edadDias+" dias de edad");
        
       
       
    }
    
}
