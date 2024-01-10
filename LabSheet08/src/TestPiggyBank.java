import java.util.*;
public class TestPiggyBank {

	static PiggyBank pb = new PiggyBank();
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/

		
		
		inputCoin();
		
		
	}
	
	public static void inputCoin() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please difine size of PiggyBank : ");
		int sizeofPiggy = scn.nextInt();
		
		pb.setPiggyBank(sizeofPiggy);
		
		System.out.println("Money Total : " + pb.getPiggyBank());
		
		MainMenu();
	}
	
	public static void MainMenu() {
		while(true) {
			textMenu();
			System.out.print("Please Select Menu [1-5] : ");
			int selectMenu = scn.nextInt();
			
			if(selectMenu == 1) {
				System.out.print("Insert 1 Baht Money : ");
				int one = scn.nextInt();
				pb.addOne(one);
				System.out.println("Money Total : " + pb.getTotal());
			}
			else if(selectMenu == 2) {
				System.out.print("Insert 2 Baht Money : ");
				int two = scn.nextInt();
				pb.addTwo(two);
				System.out.println("Money Total : " + pb.getTotal());
			}
			else if (selectMenu == 3) {
				System.out.print("Insert 5 Baht Money : ");
				int five = scn.nextInt();
				pb.addFive(five);
				System.out.println("Money Total : " + pb.getTotal());
			}
			else if (selectMenu == 4) {
				System.out.print("Insert 10 Baht Money : ");
				int ten = scn.nextInt();
				pb.addTen(ten);
				System.out.println("Money Total : " + pb.getTotal());
			}
			else if(selectMenu == 5) {
				System.out.println("Bye Bye");
				break;
			}
		}
		
	}
	public static void textMenu() {
		System.out.println("====================");
		System.out.println("Menu of PiggyBank");
		System.out.println("====================");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] Exit baht.");
		System.out.println("====================");
	}

}
