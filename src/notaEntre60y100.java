import java.util.Scanner;
/**
 *Determina si un estudiante ha aprobado si su nota es mayor o igual que 60
 * y menor o igual que 100
 * @author Jacqueline
 */
public class notaEntre60y100 {
    public static void main(String[] args) {
                   
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
     
        System.out.println("Ingrese tu calificación en la escala de 1 a 100: ");
        int calificacion = entrada.nextInt();
        
        if (calificacion >= 60 && calificacion <=100) {
            System.out.println(nombre + " has aprobado porque tu calificación es " + calificacion);
        } else {
            System.out.println(nombre + " no has pasado la materia porque tu calificación es " + calificacion);
        }
            
        
    }
}
