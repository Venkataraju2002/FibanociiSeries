import java.util.*;
public class Sum_Fib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt(); 	
		int t1 = 0,t2 =1, sum=0, 		
		for(int i = 3; i<= n; i++)
		{			
			sum = t1+t2; 
			total = sum + total;
			t1 = t2;
			t2 = sum;			
		}
		System.out.print("total = "+ total); 
	} }