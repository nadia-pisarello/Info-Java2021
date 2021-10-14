import java.util.ArrayList;
import java.util.List;

public class Ejercicios2 {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println(numeros.size()); // Tamaño del ArrayList inicial 
        numeros.add(0, 0);
        System.out.println(numeros.size()); // Tamaño del ArrayList agregando número al principio 
        numeros.add(6);
        System.out.println(numeros.size()); // Tamaño del ArrayList agregando número al final
        for(Integer numero: numeros) {
            System.out.println(numero);
        }

    }
    
}
