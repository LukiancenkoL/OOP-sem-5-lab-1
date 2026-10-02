package lab.service;

import lab.equipment.Equipment;
import lab.knight.Knight;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KnightService {
    public int calculateTotalCost(Knight knight) {
        return knight.getInventory().stream()
                .mapToInt(Equipment::getPrice)
                .sum();
    }

    public List<Equipment> sortEquipmentByWeight(Knight knight) {
        return knight.getInventory().stream()
                .sorted(Comparator.comparingInt(Equipment::getWeight))
                .collect(Collectors.toList());
    }

    public List<Equipment> findEquipmentByPriceRange(Knight knight, int minPrice, int maxPrice) {
        return knight.getInventory().stream()
                .filter(item -> item.getPrice() >= minPrice
                        && item.getPrice() <= maxPrice).collect(Collectors.toList());
    }
}