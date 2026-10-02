package lab;

import lab.equipment.Equipment;
import lab.knight.Knight;
import lab.service.KnightService;
import lab.util.EquipmentFileReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Knight arthur = new Knight("King Arthur");
        EquipmentFileReader reader = new EquipmentFileReader();
        KnightService service = new KnightService();

        System.out.println("Loading equipment from file...");
        List<Equipment> loadedGear = reader.loadEquipment("equipment.csv");
        for (Equipment item : loadedGear) {
            arthur.equip(item);
        }

        System.out.println("\n--- " + arthur.getName() + "'s Equipment ---");
        arthur.getInventory().forEach(System.out::println);

        int totalCost = service.calculateTotalCost(arthur);
        System.out.println("\nTotal Cost of Equipment: " + totalCost + " silver coins");

        System.out.println("\n--- Equipment Sorted By Weight ---");
        List<Equipment> sortedByWeight = service.sortEquipmentByWeight(arthur);
        sortedByWeight.forEach(System.out::println);

        int minPrice = 10;
        int maxPrice = 50;
        System.out.println("\n--- Equipment in Price Range (" + minPrice + " coins" + " - " + maxPrice + " coins) ---");
        List<Equipment> affordableGear = service.findEquipmentByPriceRange(arthur, minPrice, maxPrice);
        affordableGear.forEach(System.out::println);
    }
}