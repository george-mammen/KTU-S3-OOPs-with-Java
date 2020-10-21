import java.util.Scanner;

public class Prime {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scan.nextInt();
		scan.close();
		boolean flag = false;
		
		if(n == 0 || n == 1) {
			System.out.println(n + " is neither prime nor composite.");
		}
		else{
			for(int i = 2;i <= n/2;i++) {
				if(n % i == 0) {
					flag = true;
					break;
				}
			}
		
		
		if(!flag)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }}
}
		
	
			
	
		

