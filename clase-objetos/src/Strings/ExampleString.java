package Strings;

public class ExampleString {
    public static void main(String[] args) {
        String name = "Cesar";
        String name2 = "Cesar";

        System.out.println(name==name2);

        String name3 = new String( "cesar" );

        System.out.println(name3==name);
        System.out.println(name.toUpperCase());

        System.out.println(name);

        Person person = new Person("Cesar", "Eduardo" );

        System.out.println(person.toString());
    }
}
