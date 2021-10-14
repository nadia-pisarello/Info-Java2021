import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>();
        ArrayList<Integer> totalDiario = new ArrayList<Integer>();
        Integer total = 0;
        cargarHoras(scan, horasTrabajadas);
        cargarValor(scan, valorPorHora);
        totalDiario = calcularTotalDiario(horasTrabajadas, valorPorHora);
        total = montoTotal(totalDiario);
        System.out.println(totalDiario);
        System.out.printf("Total Final: $ %d\n", total);
        scan.close();
    }

    public static void cargarHoras(Scanner scan, ArrayList<Integer> horasTrabajadas) {
        System.out.println("Ingrese cantidad de horas trabajadas por día(de Lunes a Viernes, respectivamente): ");
        for (int i = 0; i < 5; i++){
            horasTrabajadas.add(scan.nextInt());
        }
    }
    
    public static void cargarValor(Scanner scan, ArrayList<Integer> valorPorHora) {
        System.out.println("Ingrese el valor por hora a cobrar (de Lunes a Viernes, respectivamente): ");
        for (int i = 0; i < 5; i++){
            valorPorHora.add(scan.nextInt());
        }
    }

    public static ArrayList<Integer> calcularTotalDiario(ArrayList<Integer> horasTrabajadas, ArrayList<Integer> valorPorHora){
        ArrayList<Integer> totalDiario = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++){
            totalDiario.add(horasTrabajadas.get(i) * valorPorHora.get(i));
        }
        return totalDiario;
    }

    public static Integer montoTotal(ArrayList<Integer> totalDiario) {
        int total = 0;
        for (int monto: totalDiario){
            total += monto;
        }
        return total;
    } 
}
