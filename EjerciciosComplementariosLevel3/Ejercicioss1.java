import java.util.ArrayList;
import java.util.List;
import  java.util.Objects;
import java.util.stream.Collectors;

public class Ejercicioss1 {
        public static void main(String[] args) {
            List<String> palabras = new ArrayList<>();            
            palabras.add("Hola");
            palabras.add(null);
            palabras.add("Informatorio");
            palabras.add("");
            List<String>filtradas = palabras.stream()
                .filter(Objects::nonNull)
                .filter(palabra -> !palabra.equals(""))
                .collect(Collectors.toList());
            System.out.println(filtradas);
    }    
}
