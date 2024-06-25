import java.util.LinkedList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            list1.add(i);
        }

        System.out.println(list1);

        for (int i = 0; i < 100; i++) {
            list2.add(i);
        }

        for (int i = 0, j = 99; i < 50 && j >= 50; i++, j--) {
            int start = list2.get(i);
            int end = list2.get(j);
            list2.set(j, start);
            list2.set(i, end);
        }

        System.out.println(list2);
    }
}