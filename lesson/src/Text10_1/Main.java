package Text10_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            int result = number1 / number2;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception!");
        } finally {

        }
    }
}
