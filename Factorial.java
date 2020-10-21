import java.util.Scanner;

public class Factorial {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for n : ");
		int n = scan.nextInt();
		int fact = 1;
		scan.close();
		for (int i = 1; i <= n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+" is : "+fact);

}
}

