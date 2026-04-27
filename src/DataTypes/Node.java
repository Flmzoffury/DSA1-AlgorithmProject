package DataTypes;

public class Node<T extends Comparable<T>>
{
    private Node<T> right;
    private Node<T> left;
    private T data;
    private int occurence;

    public Node (T inputData)
    {
        data = inputData;
        occurence = 1;
    }

    public T getData()
    {
        return data;
    }

    public int getOccurence()
    {
        return occurence;
    }

    public void add(T inputData)
    {
        Comparable<T> tempData = (Comparable<T>) data;
        if (tempData.compareTo(inputData) > 0)
        {
            if (left == null)
            {
                left = new Node<T>(inputData);
                //System.out.println("left");
            }
            else
            {
                left.add(inputData);
            }
        }
        else if (tempData.compareTo(inputData) < 0)
        {

            if (right == null)
            {
                right = new Node<T>(inputData);
                //System.out.println("right");
            }
            else
            {
                right.add(inputData);

            }
        }
        else
        {
            occurence++;
        }
    }

    public void preorderTraversal()
    {
        System.out.print("[" + data + "] ");
        if (left != null)
        {
            //System.out.print("Left of " + data + ": ");
            left.preorderTraversal();
        }
        if (right != null)
        {
            //System.out.print("Right of " + data + ": ");
            right.preorderTraversal();
        }
        return;
    }

    public void inorderTraversal()
    {
        if (left != null)
        {
            //System.out.print("Left of " + data + ": ");
            left.preorderTraversal();
        }
        System.out.print("[" + data + "] ");
        if (right != null)
        {
            //System.out.print("Right of " + data + ": ");
            right.preorderTraversal();
        }
    }

    public void postorderTraversal()
    {
        if (left != null)
        {
            //System.out.print("Left of " + data + ": ");
            left.preorderTraversal();
        }
        if (right != null)
        {
            //System.out.print("Right of " + data + ": ");
            right.preorderTraversal();
        }
        System.out.print("[" + data + "] ");
    }

    public boolean hasLeft()
    {
        return left != null;
    }

    public boolean hasRight()
    {
        return right != null;
    }

    public Node<T> getLeft()
    {
        return left;
    }

    public Node<T> getRight()
    {
        return right;
    }

}
