import java.util.*;

public class Incremento {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        scan.close();
        for (int j =0; j <= num1; j++){
            for (int i = 1; i <= j; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
