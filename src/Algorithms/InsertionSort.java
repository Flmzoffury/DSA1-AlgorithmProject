package Algorithms;

import DataTypes.ArrayList;

public class InsertionSort
{

    public static int[] insertionSortArray(int[] array) {
        int swapValue;

        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j < i; j++)
            {
                if (array[i] < array[j])
                {
                    swapValue = array[i];
                    for (int k = i; k <= i; k++)
                    {
                        array[k] = array[k-1];
                    }
                    array[j] = swapValue;
                }
            }

        }

        return array;
    }

    public static ArrayList<Integer> insertionSortArrayList(ArrayList<Integer> arrayList)
    {
        int swapValue;

        for (int i = 1; i < arrayList.size(); i++) {

            for (int j = 0; j < i; j++)
            {
                if (arrayList.get(i) < arrayList.get(j))
                {
                    swapValue = arrayList.get(i);
                    for (int k = i; k <= i; k++)
                    {
                        arrayList.set(k,arrayList.get(k-1));
                    }
                    arrayList.set(j,swapValue);
                }
            }

        }

        return arrayList;
    }
}
