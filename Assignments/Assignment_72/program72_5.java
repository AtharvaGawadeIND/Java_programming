import java.util.*;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0, j = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix");

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of row : " + (i+1));

            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void SwapRows(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 0; i < iRow-1; i = i + 2)
        {
            for(j = 0; j < iCol; j++)
            {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = temp;
            }
        }
    }
}

class program72_5
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

        mobj.SwapRows(mobj.Arr, iRow, iCol);

        System.out.println("Matrix after swapping rows : ");
        mobj.Display();
    }
}

/*Enter number of rows : 
3
Enter number of columns : 
3
Enter the elements of matrix
Enter the elements of row : 1
12
34
45
Enter the elements of row : 2
34
2
1
Enter the elements of row : 3
4
6
7
Elements of matrix are : 
12	34	45	
34	2	1	
4	6	7	
Matrix after swapping rows : 
Elements of matrix are : 
34	2	1	
12	34	45	
4	6	7	 */