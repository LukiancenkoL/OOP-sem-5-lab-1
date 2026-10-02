package lab.equipment;

public class Armor extends Equipment {
    private String bodyPart;

    public Armor(String name, int weight, int price, String bodyPart) {
        super(name, weight, price);
        this.bodyPart = bodyPart;
    }

    @Override
    public String getEquipmentType() {
        return "Armor";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Body Part: %s", bodyPart);
    }

    public String getBodyPart() {
        return bodyPart;
    }
}
