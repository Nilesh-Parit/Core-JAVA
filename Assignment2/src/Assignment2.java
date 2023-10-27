import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args)	{
		
		Scanner sc1 = new Scanner(System.in);
		
	
		int[][] arr1 = new int[][]{{1,2,3},{4,1,6},{7,8,1}};
		int[][] arr2 = new int[][]{{4,5,6},{1,3,9},{7,9,0}};
		int[][] temp = new int[arr1.length][arr1[0].length];
		
		int i=1;
		
		while(i==1)
		{
			int choice;
			System.out.println("Enter choice 1 for Addition ");
			System.out.println("Enter choice 2 for transpose ");
			System.out.println("Enter choice 3 for Find Max ");
			System.out.println("Enter choice 4 for Find Min ");
			System.out.println("Enter choice 5 for Find Count ");
			
			choice = sc1.nextInt();

			switch(choice)
			{
			case 1:
					ArrayOperation.addArray(arr1, arr2, temp);
			        Array_IO.displayArray(temp);
			        break;
			case 2:
					ArrayOperation.transpose(arr1, temp);
			        Array_IO.displayArray(temp);
			        break;
			case 3:
				    ArrayOperation.findMax(arr1);
				    break;
			case 4:
				    ArrayOperation.findMin(arr1);
				    break;
			case 5:
					ArrayOperation.findCount(arr1);
					break;
			default: 
					System.out.println("Unexpected Choice Number");
					break;
					
			}
			
			System.out.println("Enter 0 to close");
			System.out.println("Enter 1 continue");
			i=sc1.nextInt();
		}
	sc1.close();
	} 
}
