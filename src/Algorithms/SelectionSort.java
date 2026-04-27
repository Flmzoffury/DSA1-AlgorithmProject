package Algorithms;

import DataTypes.ArrayList;

public class SelectionSort
{

    public static int[] selectionSortArray(int[] array)
    {
        int min_index;
        for (int i = 0; i < array.length; i++)
        {
            min_index = i;
            for (int j = i; j < array.length; j++)
            {
                if (array[min_index] > array[j])
                {
                    min_index = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        return array;
    }

    public static ArrayList<Integer> selectionSortArrayList(ArrayList<Integer> arrayList)
    {
        int min_index;
        for (int i = 0; i < arrayList.size(); i++)
        {
            min_index = i;
            for (int j = i; j < arrayList.size(); j++)
            {
                if (arrayList.get(min_index) > arrayList.get(j))
                {
                    min_index = j;
                }
            }
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(min_index));
            arrayList.set(min_index, temp);
        }
        return arrayList;
    }

}
