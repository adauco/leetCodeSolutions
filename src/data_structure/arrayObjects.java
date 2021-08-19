package data_structure;

class maxNumber
{
    public int roll_no;
    public String name;
    public boolean favo;
    maxNumber(int roll_no, String name, Boolean favo)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.favo = favo;
    }
}

// Elements of the array are objects of a class Student.
public class arrayObjects
{
    public static void main (String[] args)
    {
        // declaring and initializing 2D array
        int arr1[][] = { {2,7,9},
                         {3,6,1},
                         {7,4,2},
                         {8,8,8} };
        System.out.println("Lenght " + arr1.length);
        System.out.println("Lenght " + arr1[0].length);
        // printing 2D array
        for (int i=0; i< arr1.length ; i++)
        {
            for (int j=0; j < arr1[0].length ; j++)
                System.out.print(arr1[i][j] + " " + " i and J " + i + j + " ");

            System.out.println();
        }
    }
}