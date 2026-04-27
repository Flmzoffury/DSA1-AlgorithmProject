package Algorithms;

import DataTypes.ArrayList;

public class LinearSearch
{

    public static boolean linearSearchArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchArrayList(ArrayList<Integer> arrayList, int target) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == target) {
                return true;
            }
        }


        return false;
    }
}
