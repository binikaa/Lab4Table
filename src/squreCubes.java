/* Program to compute squares and cubes */
import java.util.Scanner;

public class squreCubes {

	public static void main(String[] args) {
		String input;
		do
		{
		System.out.println("Learn your squares and cubes");
		System.out.println("Enter an integer");
		Scanner scr = new Scanner(System.in);
		int num= scr.nextInt();
		System.out.println("Number  Squared   Cubed");
		System.out.println("======  =======   =====");
		for(int i=1;i<=num;i++)// for each iteration the i value will increse by one 
		{
			System.out.println(i+"        "+ i*i + "       "+i*i*i);
		}
		System.out.println("Continue?(y/n)");
		Scanner scr1 = new Scanner(System.in);
		input = scr1.nextLine();
		
		// TODO Auto-generated method stub
		}while(input.equals("Y")|| input.equals("y"));//check if user wants to continue?
		System.exit(0);
		
	}

}
