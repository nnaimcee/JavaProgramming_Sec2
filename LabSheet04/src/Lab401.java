import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int valueX,valueY,total;
		
		System.out.print("Input value of X : ");
		valueX = scn.nextInt();
		
		System.out.print("Input value of Y : ");
		valueY = scn.nextInt();
		
		while(valueY < valueX) {
			System.out.print("Input value of Y, again : ");
			valueY = scn.nextInt();
		}
		
		System.out.println();
		for(int i = valueX+1 ; i <= valueY ; i++) {
			
			total = valueX + i ;
			System.out.println(valueX + " + " + i + " = " + total);
			valueX = total;
		}
	}

}
