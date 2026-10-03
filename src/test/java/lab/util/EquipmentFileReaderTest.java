package lab.util;

import lab.equipment.Equipment;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentFileReaderTest {
    @Test 
    void testLoadEquipmentSuccessfully() {
        EquipmentFileReader reader = new EquipmentFileReader();

        List<Equipment> equipment = reader.loadEquipment("equipment.csv");

        assertNotNull(equipment);
        assertFalse(equipment.isEmpty(), "The equipment list should not be empty");
        assertEquals(5, equipment.size());
    }

    @Test 
    void testLoadEquipmentFileNotFound() {
        EquipmentFileReader reader = new EquipmentFileReader();
        List<Equipment> equipment = reader.loadEquipment("non_existent_file.csv");

        assertNotNull(equipment);
        assertTrue(equipment.isEmpty(), "List should be empty if file reading fails");
    }
}
