package Text10_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String str = sc.next();
            int n = sc.nextInt();
            char targetChar = str.charAt(n);
            System.out.println(targetChar);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception!");
        } finally {
            sc.close();
        }
    }
}