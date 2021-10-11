import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos números enteros: ");
        int num1,num2,result = 0;
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();
        for (int i = 0; i < num1; i++){
            result = result + num2;
        };
        System.out.println(num1 + " x " + num2 + " = " + result);
    }
}
