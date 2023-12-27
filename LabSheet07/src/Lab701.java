import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int countOdd = 0;
		int[] nums = new int[7];
		int i = 0;
		for(int _nums:nums) {
			System.out.print("Input number "+(i+1) + " : ");
			nums[i] = scn.nextInt();
			if(_nums %2 != 0) {
				countOdd++;
			}
			i++;
					
		}
		System.out.println();
		System.out.println("There are "+countOdd +" of odd number.");
		System.out.print("List of odd number : ");
		for(int _nums:nums) {
			if(_nums %2 != 0 ) {
				System.out.print(_nums + " ");		
			}
		}
	}

}
