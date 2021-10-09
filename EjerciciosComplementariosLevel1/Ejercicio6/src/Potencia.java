import java.util.*;

public class Potencia {
    public static void main(String[] args) {
        int num1,num2,result = 1;
        System.out.println("Ingrese dos números enteros: ");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();
        for(int i = 0; i < num2; i++){
            result = result * num1;
        };
        System.out.printf("%d elevado a %d = %d\n", num1, num2, result);
    }
}
