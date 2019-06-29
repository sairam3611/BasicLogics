import java.util.*;



public class ArmstrongCheckForAnyNumber {
	
	public static int count(long n) {
		int countNum=0;
		while(n>0) {
			countNum++;
			n=n/10;
		}
		
		return countNum;
	}
	
	public static long powerSum(long n,int count) {
		long sum=1;
		for(int i=1;i<=count;i++) {
			sum=sum*n;
		}
		
		return sum;
		
	}
	
	public static void checkArmstrong(long n) {
		int count=count(n);
		long k=n;
		int c;
		long armstromgSum=0;
		while(n>0) {
			armstromgSum+=powerSum(n%10, count);
			n/=10;
		}
		
		if(armstromgSum==k) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not a armstrong");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your number");
		long n=sc.nextLong();
		
		checkArmstrong(n);
		// TODO Auto-generated method stub

	}

}
