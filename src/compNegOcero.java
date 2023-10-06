import java.util.Scanner;
/**
 *Comprueba si un número es negativo o si es cero 
 * @author Jacqueline
 */
public class compNegOcero {
    
    public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        if (numero < 0 || numero == 0) {
            System.out.println("El número " + numero + " es negativo o es cero");
        } else {
            System.out.println("El número " + numero + " es positivo y no es cero");
        }
        
    }
}
