package vendingmachine2;

import java.util.*;

public class VendingMachine {
	Scanner sc = new Scanner(System.in);
	static String[][] dis = { { "fanta", "A", "Rs.50" }, { "cokes", "B", "Rs.40" }, { "Thums", "C", "Rs.30" },
			{ "Mazaa", "D", "Rs.45" } };
	static long amount=0;

	public void display() {
		System.out.println("choose your drink hola :)");
		System.out.println("Item" + "    " + "Option" + "  " + "Price of each");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(dis[i][j] + "      ");
			}
			System.out.println();
		}
	}

	// accepts the input from the user
	public void askUser() {
		System.out.println("please enter your choice");
		char ch = sc.next().charAt(0);
		if (ch == 'A' || ch == 'a' || ch == 'B' || ch == 'b' || ch == 'C' || ch == 'c' || ch == 'D' || ch == 'd') {
			System.out.println("you choose the option " + ch);
			quantity(ch);
		}
		else {
			System.out.println("please enter the Right option");
			askUser();
		}
		

	}  
	//used to accept the quantity from the user 
	public void quantity(char ch) {
		System.out.println("enter the required number of Items of type  "+ch);
		int n=sc.nextInt();
		amount(n,ch);
	}
	
    // used to get the amount from the user
	public void amount(int k,char ch) {
		System.out.println("Note: System can accept only Rs500 and Rs.200 only");
		int amt= sc.nextInt();
		if(amt==500||amt==200) {
		amount+=amt;
		long cal;
		if(ch=='A' ||ch=='a') {
			cal= 50*k;
			if(cal>amount) {
				System.out.println("your bill is"+cal);
				System.out.println("you entered amount is not sufficient");
				amount(k,ch);
			}
			else {
				System.out.println("your change is"+""+Math.abs(amount-cal));
				amount=0;
			}
		}
		else if(ch=='B' ||ch=='b') {
			cal= 40*k;
			if(cal>amount) {
				System.out.println("your bill is"+cal);
				System.out.println("you entered amount is not sufficient");
				amount(k,ch);
			}
			else {
				System.out.println("your change is"+""+Math.abs(amount-cal));
				amount=0;
			}
		}
		else if(ch=='C' ||ch=='c') {
			cal= 30*k;
			if(cal>amount) {
				System.out.println("your bill is"+cal);
				System.out.println("you entered amount is not sufficient");
				amount(k,ch);
			}
			else {
				System.out.println("your change is"+""+Math.abs(amount-cal));
				amount=0;
			}
		}
		else {
			cal= 45*k;
			if(cal>amount) {
				System.out.println("your bill is"+cal);
				System.out.println("you entered amount is not sufficient");
				amount(k,ch);
			}
			else {
				System.out.println("your change is"+""+(amount-cal));
				System.out.println("please collect your drinks");
				System.out.println("enjoy your day");
				System.out.println("please visit agin Thank you sir/madam");
				amount=0;
			}
		}
		}
		else {
			//System.out.println("Note: System can accept only Rs500 and Rs.200 only");
			amount(k,ch);
		}
		
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VendingMachine p = new VendingMachine();
		p.display();
		p.askUser();

		sc.close();
	}

}
