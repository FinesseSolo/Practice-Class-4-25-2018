import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,
		sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter no. of elements you want in array:");
        num = scanner.nextInt();
        
        int a[] = new int[num];
        
        System.out.println("Enter all the elements:");
        
        for(int i = 0; i < num; i++)
        {
            a[i] = scanner.nextInt();
            
            sum = sum + a[i];
        }
        System.out.println("The Sum is"+sum);
	}

}
