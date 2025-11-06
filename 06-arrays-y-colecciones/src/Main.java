import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};

        System.out.println(numbers[0]);

        numbers[0] = 100;
        System.out.println(numbers[0]);

        int[] fixedArray = new int[100];

        System.out.println("Dimensión: " + fixedArray.length);

        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.add(1);
        numbers2.add(10);
        numbers2.add(100);
        System.out.println("numbers2 = " + numbers2);
    }
}