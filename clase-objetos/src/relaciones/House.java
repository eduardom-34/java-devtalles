package relaciones;

public class House {
    private Room room; //composicion
    private Door door; //composicion
    private Owner owner; //asosiacion

    public House(Door door, Owner owner, Room room) {
        this.door = door;
        this.owner = owner;
        this.room = room;
    }

    @Override
    public String toString() {
        return "House{" +
                "door=" + door +
                ", room=" + room +
                ", owner=" + owner +
                '}';
    }
}
