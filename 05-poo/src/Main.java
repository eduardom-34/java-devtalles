import com.sun.security.jgss.GSSUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);

        vehicle.setYear(2001);

        System.out.println(vehicle.toString());
    }
}