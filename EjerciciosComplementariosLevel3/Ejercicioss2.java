import java.util.*;
import java.util.stream.Collectors;

public class Ejercicioss2 {
    public static void main(String[] args) {        
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        Integer potencia  = 2;
        List<Integer> numerosPotenciados = palabras.stream()
                    .map(p-> Ejercicioss2.calcularPotencia(p, potencia))
                    .collect(Collectors.toList());
        System.out.println(numerosPotenciados);
    }
    public static Integer calcularPotencia(Integer p, Integer potencia) {
        return (int) Math.pow(p,potencia);        
    }
}
