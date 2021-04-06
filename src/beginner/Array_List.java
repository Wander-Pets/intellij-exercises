package beginner;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Borja"); //0
        names.add("Jaime"); //1
        names.add("Sabangan"); //2
        names.add("Siervo"); //3
        names.add(4,"Senerpida"); //4

        names.set(0, "John Michael Borja");

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
