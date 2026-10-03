package lab.equipment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {
    @Test
    void testWeapon() {
        Weapon weapon = new Weapon("Test Weapon", 4, 150, true);
        assertEquals("Weapon", weapon.getEquipmentType());
        assertEquals("Test Weapon", weapon.getName());
        assertTrue(weapon.isTwoHanded());
        assertEquals("[Weapon] Test Weapon - Weight: 4 kg, Price: 150 coins, Two-Handed: Yes", weapon.toString());
    }

    @Test
    void testArmor() {
        Armor armor = new Armor("Test Helmet", 2, 15, "Head");
        assertEquals("Armor", armor.getEquipmentType());
        assertEquals("Test Helmet", armor.getName());
        assertEquals("Head", armor.getBodyPart());
        assertEquals("[Armor] Test Helmet - Weight: 2 kg, Price: 15 coins, Body Part: Head", armor.toString());
    }

    @Test
    void testMount() {
        Mount mount = new Mount("Test Mount", 500, 100, "Test Breed");
        assertEquals("Mount", mount.getEquipmentType());
        assertEquals("Test Mount", mount.getName());
        assertEquals("Test Breed", mount.getBreed());
        assertEquals("[Mount] Test Mount - Weight: 500 kg, Price: 100 coins, Breed: Test Breed", mount.toString());
    }
}
