package Algorithms;

import DataTypes.ArrayList;

public class BinarySearch {
    public static boolean binarySearchArray(int[] array, int target, int start, int end) {
        if (array[start] == target || array[end] == target)
        {
            return true;
        }
        else
        {
            int mid = (end - start) / 2 + start;

            if (mid == start)
            {
                return false;
            }
            else if (array[mid] == target)
            {
                return true;
            }
            else if (array[mid] < target)
            {
                return binarySearchArray(array, target, mid, end);
            }
            else if (array[mid] > target)
            {
                return binarySearchArray(array, target, start, mid);
            }
        }
        return false;
    }

    public static boolean binarySearchArrayList(ArrayList<Integer> array, int target, int start, int end) {
        if (array.get(start) == target || array.get(end) == target)
        {
            return true;
        }
        else
        {
            int mid = (end - start) / 2 + start;

            if (mid == start)
            {
                return false;
            }
            else if (array.get(mid) == target)
            {
                return true;
            }
            else if (array.get(mid) < target)
            {
                return binarySearchArrayList(array, target, mid, end);
            }
            else if (array.get(mid) > target)
            {
                return binarySearchArrayList(array, target, start, mid);
            }
        }
        return false;
    }
}
