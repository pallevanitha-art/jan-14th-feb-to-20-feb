import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int m, n;
	    int countOdd = 0, countEven = 0;  
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
         for(int i = 0; i < m; i++){    
            for(int j = 0; j < n; j++){    
              if(a[i][j] % 2 == 0)    
                countEven++;    
              else    
                countOdd++;    
            }    
        }    
            
        System.out.println("Frequency of odd numbers: " + countOdd);    
        System.out.println("Frequency of even numbers: " + countEven);    
    
	}
}
