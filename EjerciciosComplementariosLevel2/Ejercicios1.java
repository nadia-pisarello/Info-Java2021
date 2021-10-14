import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicios1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> ciudades = new ArrayList<String>();
        String nuevaCiudad = " ";
        int contador = 1;
        boolean bandera = true;

        while (bandera == true){
            
            System.out.print("Ingrese una de sus ciudades favoritas o presione x para terminar: ");
            nuevaCiudad = scan.nextLine();
            
            if (nuevaCiudad.equals("x")) {
                bandera = false;
            } else {
                ciudades.add(nuevaCiudad);
            }
            
        }
        scan.close();

        for (String ciudad: ciudades) {
            System.out.println("#"+ contador++ + " " + ciudad);
        };
    }

}
