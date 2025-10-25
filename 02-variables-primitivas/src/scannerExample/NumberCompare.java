package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int firstNumber = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;

        System.out.println("La suma de firstNumber + secondNumber = " + sum);
        System.out.println("La diferencia de firstNumber + secondNumber = " + difference);

        if(firstNumber > secondNumber){
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("El segundo número es mayor o igual");
        }
        System.out.println("Fin de la aplcación");
        scanner.close();
    }
}
