public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Encendido el vehiculo");
    }

    public void start(boolean silentMode) {
        if(silentMode){
            System.out.println("Esta encendido en modo silencioso");
        } else{
            System.out.println("Encendido el vehiculo");
        }
    }


    public void stop() {
        System.out.println("El vehiculo está parado");
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();

        if(year<1886 || year > currentYear + 2){
            throw new IllegalArgumentException("Anio invalido!!!");
        }

        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
