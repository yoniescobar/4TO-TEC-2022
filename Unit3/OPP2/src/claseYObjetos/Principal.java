
package claseYObjetos;

public class Principal {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.dpi="123456";
        e1.nombre="Jose Antonio";
        e1.edad = 38;
        e1.estatura= 1.83f; //se agrega f si es un tipo float
        e1.tel="5855623";
        
        //mostrar la Info de e1
        System.out.println(e1.toString());
        
         Empleado e2 = new Empleado();
        e2.dpi="789456565";
        e2.nombre="Erick Lopez";
        e2.edad = 28;
        e2.estatura= 1.50f; //se agrega f si es un tipo float
        e2.tel="78895623";
        
        //mostrar la Info de e1
        System.out.println(e2.toString());
        
        
        
    }
}
