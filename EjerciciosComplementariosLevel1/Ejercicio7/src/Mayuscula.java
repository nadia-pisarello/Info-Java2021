import java.util.Scanner;

public class Mayuscula {
    public static void main(String[] args) {
        String mayuscula = "";
        System.out.println("Ingrese una palabra: ");
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        scan.close();
        for (int i = 0; i < texto.length(); i++){
           char char1 = texto.charAt(i);
           char1 -= 32;
           mayuscula += char1;

        }
        System.out.println(mayuscula);
    }
}
