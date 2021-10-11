import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        String mayuscula = "";
        System.out.println("Ingrese una palabra: ");
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        scan.close();
        for (int i = 0; i < texto.length(); i++) {
            char char1 = texto.charAt(i);
            if (char1 >= 97 && char1 <= 122) {
                char1 -= 32;
            };
            mayuscula += char1;

        }
        System.out.println(mayuscula);
    }
}
