package ejemploAbsInterfaces;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000) {
            @Override
            public void drive() {
                System.out.println("Estoy conduciendo");
            }
        };

        System.out.println(vehicle.toString());
    }
}