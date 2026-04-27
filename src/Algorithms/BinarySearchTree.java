package Algorithms;
import DataTypes.SamBinaryTree; import DataTypes.Node;

public class BinarySearchTree
{
    public static boolean binarySearchTree(Node<Integer> node, int target)
    {
        if (node.getData() == target)
        {
            return true;
        }
        else if (target < node.getData() && node.hasLeft())
        {
            return binarySearchTree(node.getLeft(), target);
        }
        else if (target > node.getData() && node.hasRight())
        {
            return binarySearchTree(node.getRight(), target);
        }
        else
        {
            return false;
        }
    }

    public static boolean binarySearchTree(SamBinaryTree<Integer> tree, int target)
    {
        return binarySearchTree(tree.getRoot(), target);
    }
}
