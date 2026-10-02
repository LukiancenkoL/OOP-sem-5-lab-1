package lab.equipment;

public class Mount extends Equipment {
    private String breed;

    public Mount(String name, int weight, int price, String breed) {
        super(name, weight, price);
        this.breed = breed;
    }

    @Override
    public String getEquipmentType() {
        return "Mount";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Breed: %s", breed);
    }

    public String getBreed() {
        return breed;
    }
}
