import Algorithms.*;
import DataTypes.SamBinaryTree;
import DataTypes.ArrayList;
import java.util.Random;

public class Tester
{
   public static void main(String[] args)
   {
       //AlgoTester.testMethodTree("binary", 100);
      // System.out.println("Enter method test: ");

      AlgoTester.testMethodArray("linear", 100);

      AlgoTester.testMethodArray("linearBinary", 100); //this only takes a while becuase of the need to sort the array

      //AlgoTester.testMethodArray("bubble", 100);

      AlgoTester.testMethodArray("insertion", 100);

      AlgoTester.testMethodArray("selection", 100);

       AlgoTester.testMethodArray("shell", 100);


//       Random rng = new Random();
//       SamBinaryTree<Integer> tree = new SamBinaryTree<>();
//
//       for (int i = 0; i < 100; i++)
//       {
//           tree.add(rng.nextInt(1000));
//       }
//       tree.add(5);
//
//       System.out.println(BinarySearchTree.binarySearchTree(tree, 5));
//       System.out.println(BinarySearchTree.binarySearchTree(tree, 10));
//       System.out.println(BinarySearchTree.binarySearchTree(tree, 10000));

//       int[] array = new int[100];
//       for (int i = 99; i >= 0; i--)
//       {
//           array[99-i] = i*2+1;
//       }
//
//       ArrayList<Integer> arrayList = DataGen.transposeArray(array);
//       array = ShellSort.shellSortArray(array);
//       arrayList = ShellSort.shellSortArrayList(arrayList);
////
////       System.out.println(Algorithms.BinarySearch.binarySearchArray(array,5, 0, array.length - 1));
////       System.out.println(Algorithms.BinarySearch.binarySearchArray(array,4, 0, array.length - 1));
////       System.out.println(Algorithms.BinarySearch.binarySearchArrayList(arrayList,5, 0, arrayList.size()-1));
////       System.out.println(Algorithms.BinarySearch.binarySearchArrayList(arrayList,4, 0, arrayList.size()-1));
////
//       for (int i = 0; i < 100; i++)
//       {
//           System.out.print(array[i]+" ");
//       }
   }
}