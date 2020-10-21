import java.util.Scanner;

public class Addition {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		scan.close();
		System.out.println(a+b);
	}

}
