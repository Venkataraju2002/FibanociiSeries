import java.util.*;
public class Fibanocii_Sreies_1{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number");
		int n =s.nextInt();
		int t1=0,t2=1,sum=0;
	System.out.println("fibnocii Series");
	System.out.print(t1+" "+t2);
	while(sum<n) {
		 sum = t1+t2;
		t1=t2;
		t2=sum;
	}
	if(sum== n)
		System.out.println("fibnocii Series");
	else
		System.out.println("not fibnocii Series");
	
	
	}

}
