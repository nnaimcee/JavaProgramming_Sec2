
public class Example701 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		for(int i = 0;i<nums.length;i++) {
			System.out.print("nums["+ i + "] = " + nums[i]+"\n");
		}
		
		
		System.out.println();
		System.out.println("[FOR-EACH]");
		System.out.println();
		int n = 0;
		for(int _nums:nums) {
			System.out.print("nums["+ n + "] = " + _nums+"\n");
			n++;
		}
		
		System.out.println();
		System.out.println("[METHOD DISPLAY]");
		System.out.println();
		printArray(nums);
	}
	
	public static void printArray(int[] number) {
		for(int i = 0;i<number.length;i++) {
			System.out.print("nums["+ i + "] = " + number[i]+"\n");
		}
	}
	
	
}
