package lab.knight;

import lab.equipment.Equipment;
import java.util.ArrayList;
import java.util.List;

public class Knight {
    private String name;
    private List<Equipment> inventory;

    public Knight(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public void equip(Equipment item) {
        if (item != null) {
            this.inventory.add(item);
        }
    }

    public String getName() {
        return name;
    }

    public List<Equipment> getInventory() {
        return inventory;
    }
}
