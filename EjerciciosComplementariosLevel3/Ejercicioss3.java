import java.util.List;
import java.util.stream.Collectors;

public class Ejercicioss3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        List<String> contador = palabras.stream()
            .filter(p -> p.startsWith("b") || p.startsWith("B"))
            .collect(Collectors.toList());
        System.out.println(contador.size());
    }
}
