import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String [] persona = new String[4];

        System.out.println("Ingrese: \nNombre y Apellido: \nEdad: \nDireccion: \nCiudad: ");
        persona[0] = scan.nextLine();
        persona[1] = scan.nextLine();
        persona[2] = scan.nextLine();
        persona[3] = scan.nextLine();

        scan.close();

        for (int i = 3; i > 0; i--){
            System.out.print(persona[i] + " - ");
        };
        System.out.print(persona[0]);
        System.out.println();
    }
}
