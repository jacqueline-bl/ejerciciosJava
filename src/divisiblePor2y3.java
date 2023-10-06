import java.util.Scanner;
/**
 *Comprueba si un número es divisible por 2 y por 3
 * @author Jacqueline
 */
public class divisiblePor2y3 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        if (numero%2 == 0 && numero%3==0){
            System.out.println("El número " + numero + " es divisible por 2 y por 3");
        } else {
            System.out.println("El número " + numero + " no es divisible, a la vez, por 2 y por 3");
        }
        
    }
    
}
