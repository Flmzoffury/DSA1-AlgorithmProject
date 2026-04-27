package Algorithms;

import DataTypes.ArrayList;

public class LinearBinarySearch
{
    public static boolean linearBinarySearchArray(int[] array, int target)
    {
        int upper = array.length - 1;
        int lower = 0;
        int mid = -1;

        while (mid != lower)
        {
            mid = (upper - lower)/2 + lower;
            if (array[upper] == target || array[lower] == target || array[mid] == target) return true;
            if (target > array[mid])
            {
                lower = mid;
            }
            else if (target < array[mid])
            {
                upper = mid;
            }
        }

        return false;
    }

    public static boolean linearBinarySearchArrayList(ArrayList<Integer> arrayList, int target)
    {
        int upper = arrayList.size() - 1;
        int lower = 0;
        int mid = -1;

        while (mid != lower)
        {
            mid = (upper-lower)/2 + lower;
            if (arrayList.get(upper) == target || arrayList.get(lower) == target || arrayList.get(mid) == target) return true;
            else if (target > arrayList.get(mid))
            {
                lower = mid;
            }
            else if (target < arrayList.get(mid))
            {
                upper = mid;
            }
        }

        return false;
    }
}
