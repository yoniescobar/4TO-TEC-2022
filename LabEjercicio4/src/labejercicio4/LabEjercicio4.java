
package labejercicio4;

import java.util.Scanner;

public class LabEjercicio4 {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int carnet;  //   = 2015010204    2015  01   02   04
        int anio,facultad,carrera,sede;
        String tFacultada="",tCarrera="",tSede="";
        
        System.out.println("Ingrese el número de Carnet: ");
        carnet = entrada.nextInt();
        
        anio = carnet/1000000;
        carnet = carnet % 1000000;
        facultad = carnet/10000;
        carnet = carnet % 10000;
        carrera = carnet /100;
        carnet = carnet % 100;
        sede = carnet;
      
       /*
        System.out.println(anio);       // año = 2015
        System.out.println(facultad);  // facultad = 1    ---- 01 
        System.out.println(carrera);   // carrera = 2    ------02 
        System.out.println(sede);      // carrera = 2    ------02
        */
      
       if((facultad ==01) && (carrera ==01)){ //validando a Ingenieria
          tFacultada = "Facultad de Ingeniera";
          tCarrera = "Ing. Sistemas";
       }else if((facultad ==01) && (carrera ==02)){ 
          tFacultada = "Facultad de Ingeniera";
          tCarrera = "Ing. Industrial";
       }else if((facultad ==01) && (carrera ==03)){
          tFacultada = "Facultad de Ingeniera";
          tCarrera = "Ing. Civil";
       }
       
       
         if((facultad ==02) && (carrera ==01)){ //validando a Economicas
          tFacultada = "Facultad de Economicas";
          tCarrera = "Auditoría";
       }else if((facultad ==02) && (carrera ==02)){ 
          tFacultada = "Facultad de Economicas";
          tCarrera = "Administración";
       }else if((facultad ==02) && (carrera ==03)){
          tFacultada = "Facultad de Economicas";
          tCarrera = "Economía";
       }
         
       //  Para facultad de humanidades (03): 01=>Pedagogía, 02=>Psicología, 03=>Trabajo Social.
       if((facultad ==03) && (carrera ==01)){ //validando a Economicas
          tFacultada = "Facultad de Humanidades";
          tCarrera = "Pedagogía";
       }else if((facultad ==03) && (carrera ==02)){ 
           tFacultada = "Facultad de Humanidades";
          tCarrera = "Psicología";
       }else if((facultad ==03) && (carrera ==03)){
           tFacultada = "Facultad de Humanidades";
          tCarrera = "Trabajo Social";
       }
       
       //Para facultad de ciencias de la salud (04): 01=>Medicina, 02=>Odontología.
        if((facultad ==04) && (carrera ==01)){ //validando a Economicas
          tFacultada = "Facultad de ciencias de la Salud";
          tCarrera = "Medicina";
       }else if((facultad ==04) && (carrera ==02)){ 
           tFacultada = "Facultad de ciencias de la Salud";
          tCarrera = "Odontología";
       }
        
        //Sedes: 01=>Guatemala, 02=>Quetzaltenango, 03=>Mazatenango, 04=>Huehuetenango.
       
        if(sede == 1){
            tSede="Guatemala";
        }else if(sede == 2){
            tSede="Quetzaltenango";
        }else if(sede == 3){
            tSede="Mazatenango";
        }else if(sede == 4){
            tSede="Huehuetenango";
        }
        
       // Entrada: 2015010204 (el programa obtendrá el año: 2015, la facultad: 01, la carrera:02 y la sede: 04).
        //Salida: Año 2015, Facultad de Ingeniería, Ing. Industrial, Huehuetenango.
        
        System.out.println("Año: "+anio+","+tFacultada+","+tCarrera+","+tSede);
        
        
    }
    
}
