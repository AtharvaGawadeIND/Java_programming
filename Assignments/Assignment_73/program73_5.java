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

    public boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int iZeroCount = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iZeroCount++;
                }
            }
        }

        if(iZeroCount > (iRow * iCol)/2)
            return true;
        else
            return false;
    }
}

class program73_5
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

        boolean bRet = mobj.ChkSparse(mobj.Arr, iRow, iCol);

        System.out.println("Is sparse matrix : " + bRet);
    }
}


/*
Enter number of rows : 
4
Enter number of columns : 
4
Enter the elements of matrix
Enter elements of row : 1
14
78
63
25
Enter elements of row : 2
741
98
65
25
Enter elements of row : 3
23
12
32
52
Enter elements of row : 4
23
45
96
36
Elements of matrix are : 
14	78	63	25	
741	98	65	25	
23	12	32	52	
23	45	96	36	
Is sparse matrix : false


*/