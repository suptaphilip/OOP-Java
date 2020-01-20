import java.util.Scanner;
public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1st number:");
		int a = sc.nextInt();
		System.out.println("Please enter 2nd number:");
		int b = sc.nextInt();
		int result = a+b;
		System.out.println("The result is :"+result);
	}
}
