package lab;

// import lab.equipment.Armor;
import lab.equipment.Equipment;
import lab.equipment.Weapon;
import lab.knight.Knight;
// import lab.service.KnightService;
// import lab.util.EquipmentFileReader;

public class Main {
    public static void main(String[] args) {
        Knight arthur = new Knight("King Arthur");
        Equipment sword = new Weapon("Sword", 14, 7, 88, true);
        arthur.equip(sword);
        System.out.println(arthur.getInventory());
    }
}
