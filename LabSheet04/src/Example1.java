import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int currentNumber,previousNumber;
		
		System.out.print("Input number : ");
		previousNumber = scn.nextInt();
		
		
		while(true) {
			System.out.print("Input Number : ");
			currentNumber = scn.nextInt();
			
			if(currentNumber < previousNumber) {
				break;
			}
			previousNumber = currentNumber;
		}
		System.out.println();
		System.out.print("BYE BYE");
	}
}
