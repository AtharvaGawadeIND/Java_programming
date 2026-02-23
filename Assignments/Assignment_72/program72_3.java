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

    public int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iMax = Arr[0][0];

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j || i + j == iCol - 1)
                {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
                }
            }
        }

        return iMax;
    }
}

class Program3
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

        System.out.println("Maximum from both diagonals is : " +
                mobj.MaxDiagonal(mobj.Arr, iRow, iCol));
    }
}


/*import java.util.*;

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

    public int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iMax = Arr[0][0];

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j || i + j == iCol - 1)
                {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
                }
            }
        }

        return iMax;
    }
}

class Program3
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

        System.out.println("Maximum from both diagonals is : " +
                mobj.MaxDiagonal(mobj.Arr, iRow, iCol));
    }
}*/ 