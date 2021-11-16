import java.util.*;
import java.util.stream.Collectors;

public class Ejercicioss2 {
    public static void main(String[] args) {        
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        Integer potencia  = 2;
        List<Integer> numeros = palabras.stream()
                    .map(p-> Ejercicioss2.potenciacion(p, potencia))
                    .collect(Collectors.toList());
        System.out.println(numeros);
    }
    public static Integer potenciacion(Integer base, Integer exponente) {
        return (int) Math.pow(base, exponente);        
    }
}
