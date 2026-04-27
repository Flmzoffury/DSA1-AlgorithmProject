package Algorithms;

import DataTypes.ArrayList;

public class BubbleSort
{
    public static int[] bubbleSortArray(int[] array) {
        boolean sorted = false;
        boolean swapped;

        while (!sorted) {
            swapped = false;

            int left;
            int right;
            for (int i = 0; i < array.length - 1; i++) {
                left = array[i];
                right = array[i + 1];
                if (left > right) {
                    array[i] = right;
                    array[i + 1] = left;
                    swapped = true;
                }
            }

            if (!swapped) {
                sorted = true;
            }
        }
        return array;
    }

    public static ArrayList<Integer> bubbleSortArrayList(ArrayList<Integer> arrayList) {
        boolean sorted = false;
        boolean swapped;

        while (!sorted) {
            swapped = false;

            int left;
            int right;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                left = arrayList.get(i);
                right = arrayList.get(i + 1);
                if (left > right) {
                    arrayList.set(i, right);
                    arrayList.set(i + 1, left);
                    swapped = true;
                }
            }

            if (!swapped) {
                sorted = true;
            }
        }
        return arrayList;
    }
}
