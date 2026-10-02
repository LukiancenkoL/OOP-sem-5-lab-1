package lab.equipment;

public class Weapon extends Equipment {
    private boolean isTwoHanded;

    public Weapon(String name, int weight, int price, boolean isTwoHanded) {
        super(name, weight, price);
        this.isTwoHanded = isTwoHanded;
    }

    @Override
    public String getEquipmentType() {
        return "Weapon";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Two-Handed: %s",
                isTwoHanded ? "Yes" : "No");
    }

    public boolean isTwoHanded() {
        return isTwoHanded;
    }

}
