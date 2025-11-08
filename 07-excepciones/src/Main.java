//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void recursive(){
        recursive();
    }

    public static void main(String[] args) {


        try {
        int result = 10/0;
        System.out.println(result);
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("Division por cero");
        }finally {
            System.out.println("Este mensaje se ejecuta siempre");
        }

        System.out.println("El progrrama finaliza");

    }
}