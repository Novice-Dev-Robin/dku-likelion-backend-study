package week02;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {

        // Lists
        // 순서 구분, 중복 허용
        // Vector, ArrayList, LinkedList

        ArrayList<Integer> list = new ArrayList(10);
        list.add(100);
        list.add(200);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

