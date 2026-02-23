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

    public boolean ChkIdentity(int Arr[][], int iRow, int iCol)
    {
        if(iRow != iCol)
            return false;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j && Arr[i][j] != 1)
                    return false;

                if(i != j && Arr[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}

class program73_4
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

        boolean bRet = mobj.ChkIdentity(mobj.Arr, iRow, iCol);

        System.out.println("Is identity matrix : " + bRet);
    }
}


/*Enter number of rows : 
3
Enter number of columns : 
3
Enter the elements of matrix
Enter elements of row : 1
1
0
0
Enter elements of row : 2
0 
1
0
Enter elements of row : 3
0
0
1
Elements of matrix are : 
1	0	0	
0	1	0	
0	0	1	
Is identity matrix : true
 */