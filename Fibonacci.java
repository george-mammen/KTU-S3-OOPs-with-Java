import java.util.Scanner;

public class Fibonacci {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for 'n' to generate the fibonacci series: ");
		int n = scan.nextInt();
		scan.close();
		int a = 0,b = 1, i = 1;
		while(i <=n) {
			System.out.print(a +" ");
			int sum = a + b;
			a = b;
			b = sum;
			i++;
		}

	}
}
