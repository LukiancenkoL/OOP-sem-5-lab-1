package lab.equipment;

public abstract class Equipment {
    private String name;
    private int weight;
    private int price;    

    public Equipment(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public abstract String getEquipmentType();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - Weight: %d kg, Price: %d coins", 
                getEquipmentType(), name, weight, price);
    }

}
