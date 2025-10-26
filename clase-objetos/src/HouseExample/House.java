package HouseExample;

public class House {
    protected int doors;
    private int windows;
    private int size;

    public House(){

    }



    public House(int doors, int windows, int size ) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void openDoor(){
        System.out.println("La puerta está abierta");
    }

    public double calculateArea() {
        return size * size;
    }
}
