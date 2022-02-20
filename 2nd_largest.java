import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the length of array : ");
    	int len = sc.nextInt();
    	int [] array = new int[len];
    	int temp,size;
    	System.out.print("Enter the array elements : ");
    	for(int i=0;i<len;i++)
    	{
    	   array[i] = sc.nextInt(); 
    	}
    	size = array.length;

      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("second largest number is:: "+array[size-2]);
	}
}
