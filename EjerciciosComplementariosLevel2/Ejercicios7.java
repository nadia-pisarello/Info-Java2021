import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios7 {

    public static void main(String[] args) {
        ArrayList<String> fizzBuzz = new ArrayList<String>();
        Scanner sc = new Scanner (System.in);
        Integer num1 = 0;
        Integer num2 = 0;
        System.out.println("Ingrese dos números enteros, el primero en ingresar debe ser menor que el segundo. ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        fizzBuzz = fizzBuzzFunction(num1, num2);
        System.out.println(fizzBuzz);  
        sc.close();  
    }
    
    public static ArrayList<String> fizzBuzzFunction(Integer num1, Integer num2) {
        ArrayList<String> fizzBuzz = new ArrayList<String>();
        if (num1 < num2) {
            String ente;
            for (int i = num1; i < num2; i++){
                ente= (i % 2 == 0 && i % 3 == 0)
                ? "FizzBuzz"
                : (i % 3 == 0)
                ? "Buzz"
                : (i % 2 == 0)
                ?"Fizz"
                :String.valueOf(i);
                fizzBuzz.add(ente);
            }
        } else {
            System.out.println("El primer número ingresado debe ser menor al segundo ingresado.");
        }
        return fizzBuzz;
    }
}
