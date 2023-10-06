import java.util.Scanner;

/**
 *Comprueba si un número es Mayor que 10 o menor que 20 
 * @author Jacqueline
 */
public class compMay10Men20 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        if (numero > 10 && numero < 20) {
            System.out.println("El número " + numero + " es mayor que 10 y menor que 20");
        } else {
            System.out.println("El número " + numero + " no está en el rango mayor que 10 y menor que 20");
        }
        
   
    }
}
