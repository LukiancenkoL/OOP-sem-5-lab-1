package lab.equipment;

public class Mount extends Equipment {
    private int speed;
    private String breed;

    public Mount(String name, int weight, int price, int speed, String breed) {
        super(name, weight, price);
        this.speed = speed;
        this.breed = breed;
    }

    @Override
    public String getEquipmentType() {
        return "Mount";
    }

    public int getSpeed() {
        return speed;
    }

    public String getBreed() {
        return breed;
    }
}
