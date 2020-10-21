import java.util.Scanner;

public class Sum {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the required value for n to generate sum : ");
		int n = scan.nextInt();
		int sum = 0;
		scan.close();
		for(int i = 0;i <=n;i++) {
			sum = sum + i;
		}
		System.out.println("The sum of first "+n+" natural numbers is "+sum);
		

}
}
