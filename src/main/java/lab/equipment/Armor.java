package lab.equipment;

public class Armor extends Equipment {
    private int defense;
    private String bodyPart;

    public Armor(String name, int weight, int price, int defense, String bodyPart) {
        super(name, weight, price);
        this.defense = defense;
        this.bodyPart = bodyPart;
    }

    @Override
    public String getEquipmentType() {
        return "Armor";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Defense: %d, Body Part: %s", 
                defense, bodyPart);
    }

    public int getDefense() {
        return defense;
    }

    public String getBodyPart() {
        return bodyPart;
    }
}
