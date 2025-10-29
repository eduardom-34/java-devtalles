public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    public void popWheelie(){
        System.out.println("Lo moto está haciendo willy");
    }

    @Override
    public void start() {
        System.out.println("La moto está encendida");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString();
    }
}
