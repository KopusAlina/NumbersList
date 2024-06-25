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
//        i < 50 означает, что мы будем перебирать первые 50 элементов списка (с 0 до 49)
//        j >= 50 означает, что мы будем перебирать последние 50 элементов списка (с 99 до 50)
//        int start = list.get(i); и int end = list.get(j);: сохраняем значения элементов, находящихся на позициях i и j
//        list.set(j, start); и list.set(i, end);: меняем местами элементы на позициях i и j


        System.out.println(list2);
    }
}