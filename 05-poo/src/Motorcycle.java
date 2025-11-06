public class Motorcycle extends Vehicle {

    private boolean hasSidecar;
    private Engine engine;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
        this.engine = new Engine();
    }

    public void popWheelie(){
        System.out.println("Lo moto está haciendo willy");
    }

    public void start() {
        System.out.println("La moto está encendida");
        engine.start();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString();
    }
}
