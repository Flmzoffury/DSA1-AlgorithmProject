package DataTypes;

public class SamBinaryTree<T extends Comparable<T>>
{
    Node<T> root;

    public SamBinaryTree()
    {
        root = null;
    }

    public void add(T data) //can either not have duplicates, store the amount of times it shows up in node, or just randomly place duplicate
    {
        if (root == null)
        {
            root = new Node<T>(data);
        }
        else
        {
            root.add(data);
        }
    }

    public void preorderTraversal()
    {
        if (root == null)
        {
            return;
        }
        else
        {
            root.preorderTraversal();
        }
    }

    public void inorderTraversal()
    {
        if (root == null)
        {
            return;
        }
        else
        {
            root.inorderTraversal();
        }
    }

    public void postorderTraversal()
    {
        if (root == null)
        {
            return;
        }
        else
        {
            root.postorderTraversal();
        }
    }

    public Node<T> getRoot()
    {
        return root;
    }

}
