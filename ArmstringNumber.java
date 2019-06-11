import java.util.*;
public class ArmstrongNumber
{ 
    public static void checkArmstrong(int k){
        int cubeSum=0;
        int p=k;
        while(k>0){
            cubeSum+=((k%10)*(k%10)*(k%10));
            k/=10;
        }
        if(p==cubeSum)
          System.out.println("entered number"+p+ "is a ArmstrongNumber");
        else
          System.out.println("entered number"+p+ "is not a ArmstrongNumber");
    }
	public static void main(String[] args) {
	
	  Scanner sc= new Scanner(System.in);
	  
	  System.out.println("enter your Number :) ");
	  
	  int n=sc.nextInt();
	  int cubeSum=0;
	  if(n<0)
	    checkArmstrong(n*(-1));
	  else
	    checkArmstrong(n);
	  
	  
	}
}
