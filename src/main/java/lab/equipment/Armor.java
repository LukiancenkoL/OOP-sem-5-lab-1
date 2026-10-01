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

    public int getDefense() {
        return defense;
    }

    public String getBodyPart() {
        return bodyPart;
    }
}
