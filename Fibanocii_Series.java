import java.util.*;
public class Fibanocii_Series {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number");
		int n =s.nextInt();
		int t1=0,t2=1;
	System.out.println("fibnocii Series");
	System.out.print(t1+" "+t2);
	for(int i=3;i<=n;i++) {
		int sum = t1+t2;
		System.out.print(" "+sum);
		t1=t2;
		t2=sum;
	}
	
	}

}
