package lab.knight;

import lab.equipment.Equipment;
import lab.equipment.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {
    @Test
    void testKnightCreation() {
        Knight knight = new Knight("Test Name");
        assertEquals("Test Name", knight.getName());
        assertTrue(knight.getInventory().isEmpty(), "New knight should have empty inventory");
    }

    @Test
    void testEquipItem() {
        Knight knight = new Knight("Test Name");
        Equipment sword = new Weapon("Sword", 5, 100, false);

        knight.equip(sword);

        assertEquals(1, knight.getInventory().size());
        assertEquals(sword, knight.getInventory().get(0));
    }

    @Test
    void testNullItem() {
        Knight knight = new Knight("Test Name");
        knight.equip(null);
        assertTrue(knight.getInventory().isEmpty(), "New knight should have empty inventory");
    }

}
