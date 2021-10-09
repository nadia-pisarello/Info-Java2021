import java.util.*;

public class SaludarUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario: ");
        
        String usuario = scan.nextLine();
        scan.close();
        System.out.println("HOLA " + usuario);

    }
}
