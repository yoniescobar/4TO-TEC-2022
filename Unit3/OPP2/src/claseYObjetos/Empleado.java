
package claseYObjetos;

public class Empleado {
    //atributos
    String dpi;
    String nombre;
    int edad;
    float estatura;
    String tel;
    
    //metodos para mostrar datos

    @Override
    public String toString() {
        return "Empleado{" + "dpi=" + dpi + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", tel=" + tel + '}';
    }
    
    
}
