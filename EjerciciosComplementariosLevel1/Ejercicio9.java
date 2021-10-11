import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto = " ";
        String letra = " ";
        int cont = 0;

        System.out.println("Ingrese una frase: ");
        texto = scan.nextLine();
        System.out.print("Ingrese la letra que desea saber cuántas veces se repite en el texto: ");
        letra = scan.nextLine();
        
        scan.close();

        for (int i = 0; i < texto.length(); i++){
            if ( letra.charAt(0) == (char) texto.charAt(i)) {
                cont += 1;
            }
        }

        System.out.println(cont);
    }
    
}
