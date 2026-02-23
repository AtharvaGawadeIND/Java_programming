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


    public int AddDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iSum = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }

        return iSum;
    }
}

class program72_1
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

        System.out.println("Addition of diagonal elements is : " +
                mobj.AddDiagonal(mobj.Arr, iRow, iCol));
    }
}

/*Enter number of rows : 
4
Enter number of columns : 
4
Enter the elements of matrix
Enter the elements of row : 1
12
23
45
12
Enter the elements of row : 2
56
34
67
45
Enter the elements of row : 3
12
78
56
09
Enter the elements of row : 4
12
56
78
98
Elements of matrix are : 
12	23	45	12	
56	34	67	45	
12	78	56	9	
12	56	78	98	
Addition of diagonal elements is : 200
*/