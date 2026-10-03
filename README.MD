# Laboratory Work 1: Knight Equipment

Task variant: Knight. Define the hierarchy of a knight's equipment. Equip the knight. Calculate the total cost. Sort the equipment based on weight. Find equipment elements that fall within a specified price range. 

## Features
* **Automated Initialization:** Loads the knight's gear from a structured `equipment.csv` file, minimizing manual console input.
* **Calculate Total Cost:** Computes the total price of all equipped items.
* **Sort by Weight:** Organizes the knight's inventory in ascending order based on the weight of the equipment.
* **Filter by Price:** Finds and displays equipment elements that fall within a specified price range.


## Class Hierarchy

    Knight
    Equipment (abstract) {weight, price, name, equipmentType}
       ├── Armor  {bodyPart}
       ├── Weapon {isTwoHanded}
       └── Mount  {breed}


## Technologies Used
* Java 21
* Apache Maven
* JUnit 5
* Mockito
* JaCoCo

## How to Run

Ensure you have Java 21 and Maven installed on your system. 

1. **Compile and execute the program:**

    `mvn compile exec:java -Dexec.mainClass="lab.Main"`


## Running Tests & Coverage


1. **Run the test suite:**

    `mvn test`


2. **Check Test Coverage:**
   After running the tests, JaCoCo generates a coverage report. View the full visual HTML report by opening:

    `target/site/jacoco/index.html`