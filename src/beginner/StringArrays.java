package beginner;

public class StringArrays {
    public static String [] getNames() {
        String [] names = new String[6];

        names[0] = "Borja";
        names[1] = "Jaime";
        names[2] = "Siervo";
        names[3] = "Sabangan";
        names[4] = "Senerpida";

        return names;
    }

    public static void main(String[] args) {
        String [] names = getNames();

        for(int i = 0; i < names.length; i++) {
            if(names[i] != null) {
                System.out.println(names[i].charAt(0));
            }
        }
    }
}
