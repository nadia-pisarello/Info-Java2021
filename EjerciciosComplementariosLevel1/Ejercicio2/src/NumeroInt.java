import java.util.*;

public class NumeroInt {
    public static void main(String[] args) {
        int numero1, numero2 = 0;
        System.out.println("Ingrese dos números enteros: ");
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        numero1 = num1.nextInt();
        numero2 = num2.nextInt();
        num1.close();
        num2.close();
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        int division = numero1/numero2;
        int modulo = numero1%numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println(numero1 + " / " + numero2 + " = " + division);
        System.out.println(numero1 + " % " + numero2 + " = " + modulo);
    }
}
