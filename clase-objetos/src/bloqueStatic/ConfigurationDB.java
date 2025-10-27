package bloqueStatic;

public class ConfigurationDB {

    static final String URL;
    static final String USER;

    static {
        URL = "jdc:myslswlwlwle";
        USER = "ADMIN";
        System.out.println("Configuracion cargada");
    }

    public static void main(String[] args) {
        System.out.println(URL);
        System.out.println(USER);
    }
}
