import java.util.List;
import java.util.stream.Collectors;

public class Ejercicioss4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> factorial = palabras.stream()
            .map(p -> Ejercicioss4.factorizando(p))
            .distinct()
            .collect(Collectors.toList());
        System.out.println(factorial);        
    }
    public static Integer factorizando (int numero) {
        if (numero==0){
          return 1;
        }else{
          return numero * factorizando(numero-1);
        }
    }
}
