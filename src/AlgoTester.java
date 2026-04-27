import Algorithms.*;
import DataTypes.SamBinaryTree;

import DataTypes.ArrayList;
import java.util.Random;

public class AlgoTester
{
    public static void testMethodArray(String methodName, int increment)
    {
        Random rng = new Random();
        int[] array;
        ArrayList<Integer> arrayList;
        long startTime;

        for (int i = 1; i <= 100; i++) {
            long aTotalTime = 0;
            long alTotalTime = 0;
            long aAvgTime;
            long alAvgTime;

            for (int j = 1; j <= 10; j++) {
                int target = rng.nextInt(100000000);


                array = DataGen.generateArray(increment * i, 100000000);
                arrayList = DataGen.transposeArray(array);


                if (methodName.equals("linear")) {
                    startTime = System.currentTimeMillis();
                    LinearSearch.linearSearchArray(array, target);
                }
                else if (methodName.equals("linearBinary"))
                {
                    array = SelectionSort.selectionSortArray(array);
                    startTime = System.currentTimeMillis();
                    LinearBinarySearch.linearBinarySearchArray(array, target);
                }
                else if (methodName.equals("binary"))
                {
                    array = SelectionSort.selectionSortArray(array);
                    startTime = System.currentTimeMillis();
                    BinarySearch.binarySearchArray(array, target, 0, array.length-1);
                }
                else if (methodName.equals("bubble"))
                {
                    startTime = System.currentTimeMillis();
                    BubbleSort.bubbleSortArray(array);
                }
                else if (methodName.equals("insertion"))
                {
                    startTime = System.currentTimeMillis();
                    InsertionSort.insertionSortArray(array);
                }
                else if (methodName.equals("selection"))
                {
                    startTime = System.currentTimeMillis();
                    SelectionSort.selectionSortArray(array);
                }
                else if (methodName.equals("shell"))
                {
                    startTime = System.currentTimeMillis();
                    ShellSort.shellSortArray(array);
                }
                else
                {
                    startTime = 0;
                }

                aTotalTime += System.currentTimeMillis() - startTime;

                if (methodName.equals("linear"))
                {
                    startTime = System.currentTimeMillis();
                    LinearSearch.linearSearchArrayList(arrayList, target);
                }
                else if (methodName.equals("linearBinary"))
                {
                    arrayList = SelectionSort.selectionSortArrayList(arrayList);
                    startTime = System.currentTimeMillis();
                    LinearBinarySearch.linearBinarySearchArrayList(arrayList, target);
                }
                else if (methodName.equals("binary"))
                {
                    arrayList = SelectionSort.selectionSortArrayList(arrayList);
                    startTime = System.currentTimeMillis();
                    BinarySearch.binarySearchArrayList(arrayList, target, 0, arrayList.size() - 1);
                }
                else if (methodName.equals("bubble"))
                {
                    startTime = System.currentTimeMillis();
                    BubbleSort.bubbleSortArrayList(arrayList);
                }
                else if (methodName.equals("insertion"))
                {
                    startTime = System.currentTimeMillis();
                    InsertionSort.insertionSortArrayList(arrayList);
                }
                else if (methodName.equals("selection"))
                {
                    startTime = System.currentTimeMillis();
                    SelectionSort.selectionSortArrayList(arrayList);
                }
                else if (methodName.equals("shell"))
                {
                    startTime = System.currentTimeMillis();
                    ShellSort.shellSortArrayList(arrayList);
                }

                alTotalTime += System.currentTimeMillis() - startTime;

            }
            aAvgTime = aTotalTime / 10;
            alAvgTime = alTotalTime / 10;
            System.out.println(i + "\t" + aAvgTime + "\t" + alAvgTime);

        }
    }

    public static void testMethodTree(String methodName, int increment)
    {
        Random rng = new Random();
        SamBinaryTree<Integer> tree;
        long startTime;

        for (int i = 1; i <= 100; i++)
        {
            long totalTime = 0;
            long avgTime;

            for (int j = 0; j < 10; j++)
            {
                tree = DataGen.generateTree(increment * i, 100000000);
                startTime = System.currentTimeMillis();
                if (methodName.equals("binary"))
                {
                    BinarySearchTree.binarySearchTree(tree, rng.nextInt(100000000));
                }
                totalTime += System.currentTimeMillis() - startTime;
            }

            avgTime = totalTime / 10;
            System.out.println(i + "\t" + avgTime);

        }
    }
}
