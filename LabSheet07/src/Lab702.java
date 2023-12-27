import java.util.*;
import java.text.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		double average = 0;
		double[] numStudent = new double[5];
		DecimalFormat frm = new DecimalFormat("#.00");
		
		
		
		for(int i = 0;i <numStudent.length;i++ ) {
			System.out.print("Input score of student " +(i+1)+" : ");
			numStudent[i] = scn.nextDouble();
			average += numStudent[i] / numStudent.length;
		}
		System.out.println();
		System.out.println("Average of "+ numStudent.length+ " student is "+ frm.format(average));
		for(int i = 0 ; i < numStudent.length;i++) {
			if(numStudent[i] > average) {
				System.out.println("Student "+ (i+1) + " ("+frm.format(numStudent[i])+")");
			}
		}
	}

}
