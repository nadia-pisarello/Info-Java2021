import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ejercicios6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleados = new HashSet<Empleado>();
        Map<Integer,Integer> sueldosEmpleados = new HashMap<Integer, Integer>();
        cargarEmpleados(empleados);
        sueldosEmpleados = calcularSueldos(empleados);
        System.out.println(empleados);
        System.out.println(sueldosEmpleados);
   
    }
    // cargando empleados solo por incremento
    public static void cargarEmpleados(HashSet<Empleado> empleados) {
        for (int i = 1; i < 11; i++) {
          empleados.add(new Empleado("Nombre Prueba "+i, 35020595+i*15, 30, 500));
        }
    }

    public static HashMap<Integer, Integer> calcularSueldos(HashSet<Empleado> empleados) {
        HashMap<Integer, Integer> sueldosEmpleados = new HashMap<Integer, Integer>();
        for (Empleado empleado : empleados) {
          sueldosEmpleados.put(empleado.obtenerDNI(), empleado.sueldo());
        }
        return sueldosEmpleados;

    }

}


