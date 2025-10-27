package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = getNumber(scanner, "Ingrese el primer número");

        int second = getNumber(scanner, "Ingrese el segundo número");

        printArithemitcOperations(first, second);

        compareNumber(first, second);

    }

    public static int getNumber(Scanner scanner, String message) {
        System.out.println(message);
        int number = scanner.nextInt();
        return number;
    }

    public static void printArithemitcOperations(int firstNumber, int secondNumber){
        System.out.println("La suma de a + b = " + (firstNumber + secondNumber));
        System.out.println("La diferencia de a - b = " + (firstNumber - secondNumber));
    }

    public static void compareNumber(int first, int second){
        if(first>second){
            System.out.println("El primero número es mayor");
        } else {
            System.out.println("El segundo número es mayor o igual");
        }
    }
}
