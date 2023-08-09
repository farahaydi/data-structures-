package JavaChallenge2;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab02 {
    public static void main(String[] args) {
        int array []={1,2,3,4,5,8};
        int n=-9;
        System.out.println(Arrays.toString(insertShiftArray(n,array))); 

    }

    public static int [] insertShiftArray(int n, int list[]) {
        int middleIndex = list.length / 2;
        list[middleIndex]=n;
        return list;
    }
}