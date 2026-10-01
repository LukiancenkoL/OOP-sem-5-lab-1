package lab.util;

import lab.equipment.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EquipmentFileReader {

    public List<Equipment> loadEquipment(String fileName) {
        List<Equipment> equipmentList = new ArrayList<>();

        try (InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
                BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty())
                    continue;

                String[] data = line.split(",");
                String type = data[0].trim().toUpperCase();
                String name = data[1].trim();
                int weight = Integer.parseInt(data[2].trim());
                int price = Integer.parseInt(data[3].trim());

                switch (type) {
                    case "WEAPON":
                        equipmentList.add(new Weapon(name, weight, price,
                                Integer.parseInt(data[4].trim()),
                                Boolean.parseBoolean(data[5].trim())));
                        break;
                    case "ARMOR":
                        equipmentList
                                .add(new Armor(name, weight, price,
                                        Integer.parseInt(data[4].trim()), data[5].trim()));
                        break;
                    case "MOUNT":
                        equipmentList
                                .add(new Mount(name, weight, price,
                                        Integer.parseInt(data[4].trim()), data[5].trim()));
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return equipmentList;
    }
}
