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

    @Override
    public String toString() {
        return super.toString() + String.format(", Speed: %d, Breed: %s", 
                speed, breed);
    }

    public int getSpeed() {
        return speed;
    }

    public String getBreed() {
        return breed;
    }
}
