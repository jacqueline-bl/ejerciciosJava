import java.util.Scanner;
/**
 *Comprueba si un número es múltiplo de 3 pero no múltiplo de 5
 * @author Jacqueline
 */
public class compMultiplo3yNO5 {
    public static void main(String[] args) {
        
     Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        if (numero%3 == 0 && numero%5 !=0){
            System.out.println("El número " + numero + " es múltiplo de 3 pero no múltiplo de 5");
        } else {
            System.out.println("El número " + numero + " no cumple la condición de ser múltiplo de 3 pero no de 5");
        }
        
    }
}
