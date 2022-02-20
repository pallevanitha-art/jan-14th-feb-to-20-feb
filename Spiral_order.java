import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int m, n;
        Scanner in = new Scanner(System.in);
 
        System.out.println("Enter the number of rows");
        m = in.nextInt();
 
        System.out.println("Enter the number columns");
        n = in.nextInt();
 
        int a[][] = new int[m][n];
        
 
        System.out.println("Enter the elements of matrix");
 
        for (int i= 0 ; i < m ; i++ )
        { 
            for (int j= 0 ; j < n ;j++ )
            a[i][j] = in.nextInt();
 
            System.out.println();
        }

    int first_row=0;
    int last_row=m-1;
    int first_column=0;
    int last_column=n-1;

    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(a[i][j]+"\t");
      }
      System.out.println();
    }
    
    System.out.println("The Output of the given matrix in spiral order: ");
    int count=0;

    
    while((first_row<=last_row) && (first_column<=last_column))
    {
      for(int i=first_column;i<=last_column;i++)
      {
        if(count<m*n)
        {
          count++;


          System.out.print(a[first_row][i]+" ");
    

        }
      }

      for(int i=first_row+1;i<=last_row;i++)
      {
        if(count<m*n)
        {
          count++;

        
          System.out.print(a[i][last_column]+" ");
    
        }
      }

      for(int i=last_column-1;i>=first_column;i--)
      {
        if(count<m*n)
        {
          count++;

        
          System.out.print(a[last_row][i]+" ");
    
        }
      }

      for(int i=last_row-1;i>first_row;i--)
      {
        if(count<m*n)
        {
          count++;

        
          System.out.print(a[i][first_column]+" ");
    
        }
      }

      first_row++;
      first_column++;
      last_row--;
      last_column--;
    }

	}
}
