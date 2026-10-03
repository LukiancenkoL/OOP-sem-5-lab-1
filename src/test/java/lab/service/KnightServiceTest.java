package lab.service;

import lab.equipment.Equipment;
import lab.knight.Knight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class KnightServiceTest {

    private KnightService knightService;
    private Knight mockKnight;
    private Equipment mockItem1;
    private Equipment mockItem2;

    @BeforeEach
    void setUp() {
        knightService = new KnightService();
        
        mockKnight = Mockito.mock(Knight.class);
        mockItem1 = Mockito.mock(Equipment.class);
        mockItem2 = Mockito.mock(Equipment.class);

        when(mockItem1.getPrice()).thenReturn(20);
        when(mockItem1.getWeight()).thenReturn(10);
        
        when(mockItem2.getPrice()).thenReturn(50);
        when(mockItem2.getWeight()).thenReturn(5);

        when(mockKnight.getInventory()).thenReturn(Arrays.asList(mockItem1, mockItem2));
    }

    @Test
    void testCalculateTotalCost() {
        int totalCost = knightService.calculateTotalCost(mockKnight);
        assertEquals(70, totalCost, "Total cost should be 20 + 50 = 70");
    }

    @Test
    void testSortEquipmentByWeight() {
        List<Equipment> sorted = knightService.sortEquipmentByWeight(mockKnight);
        
        assertEquals(2, sorted.size());
        assertEquals(mockItem2, sorted.get(0), "Item with weight 5 should be first");
        assertEquals(mockItem1, sorted.get(1), "Item with weight 10 should be second");
    }

    @Test
    void testFindEquipmentByPriceRange() {
        List<Equipment> affordable = knightService.findEquipmentByPriceRange(mockKnight, 10, 30);
        
        assertEquals(1, affordable.size(), "Should only find one item in this range");
        assertEquals(mockItem1, affordable.get(0), "Should find the item costing 20");
    }
}