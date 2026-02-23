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

    public void ReverseCol(int Arr[][], int iRow, int iCol)
    {
        for(int j = 0; j < iCol; j++)
        {
            for(int i = 0; i < iRow/2; i++)
            {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[iRow-1-i][j];
                Arr[iRow-1-i][j] = temp;
            }
        }
    }
}

class program73_3
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

        mobj.ReverseCol(mobj.Arr, iRow, iCol);

        System.out.println("Matrix after reversing columns : ");
        mobj.Display();
    }
}



/*Enter number of rows : 
4 
Enter number of columns : 
4
Enter the elements of matrix
Enter elements of row : 1
344
56
45
23
Enter elements of row : 2
56
87
66
77
Enter elements of row : 3
56
23 
4 
5
Enter elements of row : 4
6
45
32
11
Elements of matrix are : 
344	56	45	23	
56	87	66	77	
56	23	4	5	
6	45	32	11	
Matrix after reversing columns : 
Elements of matrix are : 
6	45	32	11	
56	23	4	5	
56	87	66	77	
344	56	45	23 */