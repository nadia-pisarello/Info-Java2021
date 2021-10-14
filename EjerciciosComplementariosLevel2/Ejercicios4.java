import java.util.*;

public class Ejercicios4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<String>();

        estudiantes = cargarLista(sc, estudiantes);
        System.out.println("Lista completa de Alumnos: ");
        mostrarLista(estudiantes);
        ArrayList<List<String>> cursos = new ArrayList<List<String>>();
        cursos = separarEnGrupos(estudiantes);
        System.out.println("Curso 1:");
	    mostrarLista(cursos.get(0));
	    System.out.println("curso 2:");
    	mostrarLista(cursos.get(1));
	    System.out.println("Curso 3:");
	    mostrarLista(cursos.get(2));
        
        sc.close();

    }

    public static ArrayList<String> cargarLista(Scanner sc, ArrayList<String> estudiantes) {
        System.out.println("Ingresar los nombres de los estudiantes:");
        for (int i = 0; i < 12; i++) {
            estudiantes.add(sc.nextLine());
        }
        return estudiantes;
    }

    public static ArrayList<List<String>> separarEnGrupos(ArrayList<String> estudiantes) {
        ArrayList<List<String>> cursos = new ArrayList<List<String>>();
        cursos.add(estudiantes.subList(0, 4));
        cursos.add(estudiantes.subList(4, 8));
        cursos.add(estudiantes.subList(8, estudiantes.size()));
        return cursos;
    }

    public static void mostrarLista(List<String> estudiantes) {
        for (String estudiante: estudiantes){
            System.out.println(estudiante);
        }
    }

}