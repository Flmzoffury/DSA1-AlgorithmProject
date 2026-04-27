import DataTypes.SamBinaryTree;
import DataTypes.ArrayList;
import java.util.Random;

public class DataGen
{
    public static int[] generateArray(int length, int bound) {
        Random rng = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = rng.nextInt(bound);
        }


        return array;

    }


    public static ArrayList<Integer> transposeArray(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }

        return arrayList;
    }

    public static SamBinaryTree<Integer> generateTree(int nodes, int bound)
    {
        Random rng = new Random();
        SamBinaryTree<Integer> tree = new SamBinaryTree<>();
        for (int i = 0; i < nodes; i++)
        {
            tree.add(rng.nextInt(bound)); //higher bounds result in less frequent repeated node values
        }
        return tree;
    }
}
