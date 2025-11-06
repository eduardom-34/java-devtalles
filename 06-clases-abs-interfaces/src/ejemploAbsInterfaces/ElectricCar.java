package ejemploAbsInterfaces;

public class ElectricCar extends Vehicle implements Electric, SelfDriving{
    private int batterLevel;

    public ElectricCar(String brand, String model, int year, int batterLevel) {
        super(brand, model, year);
        this.batterLevel = batterLevel;
    }

    @Override
    public void drive() {
        System.out.println("El auto electrico esta en marcha");
    }

    @Override
    public void charBattery() {
        batterLevel = MAX_BATTERY_CAPACITY;
        System.out.println("La bateria esta cargada al 100%");
    }

    @Override
    public void activateAutoPilot() {
        System.out.println("Modo piloto activado");
    }
}
