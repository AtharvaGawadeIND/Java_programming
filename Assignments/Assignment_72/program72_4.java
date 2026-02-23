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

    public void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;

        System.out.println("Addition of each column is : ");

        for(j = 0; j < iCol; j++)
        {
            int iSum = 0;

            for(i = 0; i < iRow; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.print(iSum + "\t");
        }
    }
}

class program72_4
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

        mobj.AddColumn(mobj.Arr, iRow, iCol);
    }
}

/*Enter number of rows : 
3
Enter number of columns : 
3
Enter the elements of matrix
Enter the elements of row : 1
78
95
45
Enter the elements of row : 2
62
45
21
Enter the elements of row : 3
14
525
66
Elements of matrix are : 
78	95	45	
62	45	21	
14	525	66	
Addition of each column is : 
154	665	132 */