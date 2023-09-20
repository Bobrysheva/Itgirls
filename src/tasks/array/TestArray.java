package week7;
import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
