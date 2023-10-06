import java.util.Scanner;
/**
 * Comprobar si un número es positivo y no es igual a cero
 * @author Jacqueline
 */
public class compPosYnoCero {
    public static void main(String[] args) {
        
    Scanner entrada= new Scanner (System.in);
    
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        if (numero > 0 && numero !=0) {
            System.out.println("El número " + numero + " es positivo y no es igual que cero");
        } else {
            System.out.println("El número " + numero + " no es positivo o es cero");
        }
        
    }
}
