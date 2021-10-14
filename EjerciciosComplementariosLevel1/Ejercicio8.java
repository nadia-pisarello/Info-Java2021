import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese: \nNombre y Apellido: \nEdad: \nDireccion: \nCiudad: ");
        String nombre = scan.nextLine();
        Integer edad = sc.nextInt();
        String direccion = scan.nextLine();
        String ciudad = scan.nextLine();
        sc.close();
        scan.close();

        System.out.printf("%s - %s - %d - %s", ciudad, direccion, edad, nombre);
        System.out.println();
    }
}

