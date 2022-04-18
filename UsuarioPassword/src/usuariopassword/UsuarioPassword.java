
package usuariopassword;

import java.util.Scanner;

public class UsuarioPassword {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       //variables
        String usuario,password;
       
        //ingreso de datos
        System.out.print("Ingrese su usuario: ");
        usuario = entrada.nextLine();
        System.out.print("Ingrese su Contraseña: ");
        password = entrada.nextLine();
        
        //procesos
        
         if(usuario.equals("yoni") && (password.equals("yoni123"))){
             System.out.println("Bienvenido al Sistema....");
         }else{
             System.out.println("El usuario o Contraseña es incorrecta!! intente nuevamente...");
         }
        
        
       
        
    }
    
}
