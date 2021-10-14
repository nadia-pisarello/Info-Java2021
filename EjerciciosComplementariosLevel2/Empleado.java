// archivo complementario para Ejercicios6.java

public class Empleado {

    String nombre;
    Integer dni;
    Integer horas;
    Integer valorPorHora;

    public Empleado(String nombre, int dni, int horas, int valorPorHora) {
            this.nombre = nombre;
            this.dni = dni;
            this.horas = horas;
            this.valorPorHora = valorPorHora;
    }

    public String toString() {
        return ("Nombre: " + this.nombre + String.valueOf(" DNI: " + this.dni + " Horas Trabajadas: " + this.horas + " Valor: " + this.valorPorHora));
    }

    public Integer sueldo() {
        return (this.horas * this.valorPorHora);
    }

    public Integer obtenerDNI() {
        return (this.dni);
    }

}
