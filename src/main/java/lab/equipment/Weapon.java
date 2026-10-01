package lab.equipment;

public class Weapon extends Equipment {
    private int damage;
    private boolean isTwoHanded;

    public Weapon(String name, int weight, int price, int damage, boolean isTwoHanded) {
        super(name, weight, price);
        this.damage = damage;
        this.isTwoHanded = isTwoHanded;
    }

    @Override
    public String getEquipmentType() {
        return "Weapon";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Damage: %d, Two-Handed: %s", 
                damage, isTwoHanded ? "Yes" : "No");
    }

    public int getDamage() {
        return damage;
    }

    public boolean isTwoHanded() {
        return isTwoHanded;
    }

}
