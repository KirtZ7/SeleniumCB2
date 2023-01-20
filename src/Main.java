import java.util.ArrayList;

public class Main {

    //Declare ARRAYLIST and store name of your group member in that list and iterate only your name through FOR EACH LOOP
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<String>();

        group.add("Kirtan");
        group.add("Jiten");
        group.add("Hetvi");
        group.add("Minesh");

        for (String a:group) {
            //iterate thro the arraylist
            if (a.equalsIgnoreCase("kirtan")){
                System.out.println(a);
            }
        }
        for (String b:group) {
            if (b.equalsIgnoreCase("Jiten")){
                System.out.println(b);
            }

        }
    }
}