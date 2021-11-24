import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicioss5 {
    public static void main(String[] args) {
        List<Alumno5> alumno = List.of(new Alumno5("Soledad", "Rhum", LocalDate.of(2001, 8, 24)),
                new Alumno5("Valeria", "Gin", LocalDate.of(2002, 5, 17)),
                new Alumno5("Gonzalo", "Jerez", LocalDate.of(2002, 3, 8)),
                new Alumno5("Jonas", "Vinotinto", LocalDate.of(2002, 4, 9)),
                new Alumno5("Pilar", "Bermut", LocalDate.of(2001, 10, 15)));
        Map<String, Integer> edadDeAlumno = alumno.stream().collect(Collectors.toMap(a -> (a.getNombre() + " " + a.getApellido()),
                                                                                     a -> Ejercicioss5.getEdad(a.getFechaNacimiento())));
        System.out.println(edadDeAlumno);
    }

    public static Integer getEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}
