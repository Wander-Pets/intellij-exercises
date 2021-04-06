package beginner;

public class House {
    private int numOfWindows;
    private int numOfDoors;
    private String typeOfRoof;
    private String typeOfWall;
    //no argument constructor
    public House() {
        numOfDoors = 0;
        numOfWindows = 0;
        typeOfRoof = null;
        typeOfWall = null;
    }
    //method overloading, having 2 identical names of methods but different
    //arguments
    public House(int numOfDoors, int numOfWindows,
                 String typeOfRoof, String typeOfWall) {
        this.numOfDoors = numOfDoors;
        this.numOfWindows = numOfWindows;
        this.typeOfWall = typeOfWall;
        this.typeOfRoof = typeOfRoof;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public String getTypeOfWall() {
        return typeOfWall;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }

    public void setTypeOfWall(String typeOfWall) {
        this.typeOfWall = typeOfWall;
    }


}
