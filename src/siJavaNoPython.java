import java.util.Scanner;

/**
 *Verifica si una cadena de texto contiene la palabra "Java" y no la palabra "Python"
 * @author Jacqueline
 */
public class siJavaNoPython {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("¿Cuál lenguaje te gusta más entre Java y Python? Explica por qué: ");
        String cadenaTexto = entrada.nextLine();
        
        boolean contieneJava= cadenaTexto.contains("Java");
        boolean contienePython= cadenaTexto.contains("Python");
        if (contieneJava == true && contienePython== false){  
            System.out.println("El texto ingresado contiene la palabra ¨Java¨ y no la palabra ¨Pyton¨");
        }else{
            System.out.println("El texto ingresado no contiene la palabra ¨Java¨ y sí la palabra ¨Pyton¨");
        } 
    }
}
