import java.util.Scanner;

public class InputControl
{
    Scanner textReader;

    public InputControl()
    {
        textReader = new Scanner(System.in);
    }

    public void initialInput()
    {
        System.out.println("--------------------------------------");
        System.out.println("Enter command start (type H for help): ");
        String input = textReader.next().toLowerCase();
        if (input.equals("h"))
        {
            printHelp();
        }
        else if (input.equals("exit"))
        {
            System.exit(0);
        }
        else if (input.equals("tree"))
        {
            inputTree();
        }
        else if (input.equals("arrays"))
        {
            inputArray();
        }
    }

    private void printHelp()
    {
        System.out.println("Enter exit to exit the program\nEnter tree to test a tree algorithm\nEnter arrays to test an array/ArrayList algorithm");
    }

    private void inputTree()
    {
        System.out.println("Enter a tree algorithm from the following:\nbinarysearchtree");
        String input = textReader.next().toLowerCase();
        if (input.equals("binarysearchtree"))
        {
            AlgoTester.testMethodTree("binary", 10000);
        }
    }

    private void inputArray()
    {
        System.out.println("Enter an array/ArrayList algorithm from the following:" +
                "\nlinearSearch" +
                "\nlinearBinary" +
                "\nrecursiveBinary" +
                "\nbubbleSort" +
                "\ninsertionSort" +
                "\nselectionSort" +
                "\nshellSort");
        String input = textReader.next().toLowerCase();
        if (input.equals("linearsearch"))
        {
            AlgoTester.testMethodArray("linear", 100);
        }
        else if (input.equals("linearbinary"))
        {
            AlgoTester.testMethodArray("linearBinary", 100);

        }
        else if (input.equals("recursivebinary"))
        {
            AlgoTester.testMethodArray("binary", 100);
        }
        else if (input.equals("bubblesort"))
        {
            AlgoTester.testMethodArray("bubble", 100);
        }
        else if (input.equals("insertionsort"))
        {
            AlgoTester.testMethodArray("insertion", 100);
        }
        else if (input.equals("selectionsort"))
        {
            AlgoTester.testMethodArray("selection", 100);
        }
        else if (input.equals("shellsort"))
        {
            AlgoTester.testMethodArray("shell", 100);
        }

    }
}
