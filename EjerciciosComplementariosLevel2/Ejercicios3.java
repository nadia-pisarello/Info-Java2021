import java.util.*;

public class Ejercicios3 {

    public static void main(String[] args) {
        
        ArrayList<Integer> cartas = new ArrayList<>();
        System.out.println("Mazo ordenado: ");
        crearBaraja(cartas);
        System.out.println(cartas);
        Collections.reverse(cartas);
        System.out.println("Mazo invertido: " + cartas);
        Collections.shuffle(cartas);
        System.out.println("Mazo mezaclado: " + cartas);

    }

    public static ArrayList<Integer> crearBaraja(ArrayList<Integer> baraja) {
        for (int i = 1; i < 14; i++) {
            baraja.add(i);
        }
        return baraja;
    }
    

    
}