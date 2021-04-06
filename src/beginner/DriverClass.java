package beginner;

public class DriverClass {
    public static void main(String[] args) {
        House house = new House(2, 10,
                "Tiles", "Bricks");
        house.setNumOfDoors(3);
        house.setTypeOfWall("Plaster");

        System.out.println("House:");
        System.out.println("Num of Doors: " + house.getNumOfDoors());
        System.out.println("Num of Windows: " + house.getNumOfWindows());
        System.out.println("Type of Roof: " + house.getTypeOfRoof());
        System.out.println("Type of Wall: " + house.getTypeOfWall());

    }
}
