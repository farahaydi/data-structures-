package JavaChallenge2;

import java.util.ArrayList;

public class Lab02 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        insertShiftArray(25, myList);
    }

    public static ArrayList<Integer> insertShiftArray(int n, ArrayList<Integer> list) {
        int middleIndex = (int) Math.ceil((double) list.size() / 2);
        list.add(middleIndex, n);
        return list;
    }
}