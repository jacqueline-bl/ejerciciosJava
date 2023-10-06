import java.util.Scanner;
/**
 *Determina si un usuario tiene acceso si ha ingresado un nombre de usuario
 * y una contraseña válidos 
 * @author Jacqueline
 */
public class compUsuarioContraseña {
    public static void main(String[] args) {
        
        String usuarioGuardado = "Jacqueline";
        String contraseñaGuardada = "Manzan4";
         
        Scanner entrada =new Scanner (System.in);
        
        System.out.println("Ingrese su usuario: ");
        String usuarioIngresado = entrada.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contraseñaIngresada =entrada.nextLine();
        
        boolean sonIgualUsuario = usuarioGuardado.equals(usuarioIngresado);
        boolean sonIgualContraseña= contraseñaGuardada.equals(contraseñaIngresada);
      
        if (sonIgualUsuario && sonIgualContraseña){
            System.out.println("Usuario y contraseña verificadas, bienvenido o bienvenida");
        }else {
            System.out.println("Usario y/o contraseña son erróneos, vuelve a intentarlo");
        }
        
    }
}
