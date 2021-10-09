import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Ingrese un número entero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        System.out.println("El factorial de " + numero + " es: " + FuncionFactorial(numero));
    }
    
    public static int FuncionFactorial(int numero){
        if (numero == 0){
            return(1);
        } else {
            return numero * FuncionFactorial(numero-1);
        }
    }
}

