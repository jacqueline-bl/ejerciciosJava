import java.util.Scanner;
/**
 *Comprueba si un número es mayor que 100 o menor que -100
 * @author Jacqueline
 */
public class compMay100MenMenos100 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        if (numero > 100 || numero < -100) {
            System.out.println("El número " + numero + " puede ser mayor que 100 o menor que -100");
        } else {
            System.out.println("El número " + numero + " puede ser menor que 100 o mayor que -100");
        }
        
    } 
}//fin class
