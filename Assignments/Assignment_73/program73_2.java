import java.util.*;

class Matrix
{
    public int iRow, iCol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        iRow = a;
        iCol = b;
        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix");

        for(int i = 0; i < iRow; i++)
        {
            System.out.println("Enter elements of row : " + (i+1));
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of matrix are : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void ReverseRow(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol/2; j++)
            {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i][iCol-1-j];
                Arr[i][iCol-1-j] = temp;
            }
        }
    }
}

class program73_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        mobj.ReverseRow(mobj.Arr, iRow, iCol);

        System.out.println("Matrix after reversing rows : ");
        mobj.Display();
    }
}


/*Enter number of rows : 
3
Enter number of columns : 
3
Enter the elements of matrix
Enter elements of row : 1
1
2
45
Enter elements of row : 2
35
76
56
Enter elements of row : 3
87
98
34
Elements of matrix are : 
1	2	45	
35	76	56	
87	98	34	
Matrix after reversing rows : 
Elements of matrix are : 
45	2	1	
56	76	35	
34	98	87 */