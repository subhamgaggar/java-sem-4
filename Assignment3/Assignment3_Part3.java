package sem4_java;
import java.util.ArrayList;

public class Assignment3_Part3 {
    public static void main(String[] args) {
        PRO obj = new PRO();
        ArrayList l = obj.PRO();
        obj.PRO(l);
    }
}
class PRO {
    private ArrayList j;

    ArrayList PRO() {
        String[] names = {"A", "B", "C", "D", "E"};
        ArrayList<String> a1 = new ArrayList<String>();
        for (int i = 0; i < names.length; i++) {
            a1.add(names[i]);
        }
        System.out.println("Original ArrayList : ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(a1.get(i));
        }

        a1.add("X");
        a1.add("Y");
        a1.add("Z");

        System.out.println("\nNew ArrayList : ");
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        return (a1);
    }

    void PRO(ArrayList j) {
        this.j = j;
        String[] str = new String[5];

        System.out.println("\nArray : ");

        for (int i = 0; i < str.length; i++) {
            str[i]=(String) j.get(i);
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}


