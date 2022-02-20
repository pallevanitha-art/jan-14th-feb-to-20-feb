import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i, j, rows, columns, sum = 0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("\n Enter Matrix Rows and Columns :  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] SumOppdia_arr = new int[rows][columns];
		
		System.out.println("\n Please Enter the Matrix Items :  ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				SumOppdia_arr[i][j] = sc.nextInt();
			}		
		}
		
		for(i = 0; i < rows ; i++)
		{
			
			sum = sum + SumOppdia_arr[i][rows - i - 1];
		}
		System.out.println("\nThe Sum of Matrix Opposite Diagonal Items = " + sum);

	}
}
