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

    public void Transpose(int Arr[][], int iRow, int iCol)
    {
        System.out.println("Transpose of matrix is : ");

        for(int j = 0; j < iCol; j++)
        {
            for(int i = 0; i < iRow; i++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class program73_1
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

        mobj.Transpose(mobj.Arr, iRow, iCol);
    }
}

/*Enter number of rows : 
4
Enter number of columns : 
4
Enter the elements of matrix
Enter elements of row : 1
12
23
45
34
Enter elements of row : 2
78
56
45
2
Enter elements of row : 3
12
34
65
7
Enter elements of row : 4
6
5
8
5
Elements of matrix are : 
12	23	45	34	
78	56	45	2	
12	34	65	7	
6	5	8	5	
Transpose of matrix is : 
12	78	12	6	
23	56	34	5	
45	45	65	8	
34	2	7	5	 */