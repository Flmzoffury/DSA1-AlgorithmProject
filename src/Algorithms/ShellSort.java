package Algorithms;

import DataTypes.ArrayList;

//methods created using code from https://www.geeksforgeeks.org/dsa/shell-sort/
public class ShellSort
{
    public static int[] shellSortArray(int[] array) {
        int swapValue;

        for (int gap = array.length/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < array.length; i++)
            {
                swapValue = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > swapValue)
                {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = swapValue;

            }
        }

        return array;
    }

    public static ArrayList<Integer> shellSortArrayList(ArrayList<Integer> arrayList) {
        int swapValue;

        for (int gap = arrayList.size()/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < arrayList.size(); i++)
            {
                swapValue = arrayList.get(i);

                int j = i;

                while (j >= gap && arrayList.get(j - gap) > swapValue)
                {
                    arrayList.set(j, arrayList.get(j - gap));
                    j -= gap;
                }
                arrayList.set(j, swapValue);
            }
        }

        return arrayList;
    }
}
