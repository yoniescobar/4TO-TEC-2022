
package ClasesYObjetos;

public class Auto {
    //Atributos
    String placa;
    String color;
    double precio;
    String marca;
    int    stock; //existencia
    
    //metodos

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", color=" + color + ", precio=" + precio + ", marca=" + marca + ", stock=" + stock + '}';
    }
    
    public void arrancar(){
        System.out.println("El auto esta Prendido.. grrr rrrr");
    }
    
       
}
