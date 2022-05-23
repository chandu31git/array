import java.util.Scanner;
public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter any number : ");

		
		int number =in.nextInt();

		if( (number&1) == 0)
		{
		System.out.println( number + " is even number");
		}else
		{
		System.out.println(  number + "  is odd number");
		}

	}

}
