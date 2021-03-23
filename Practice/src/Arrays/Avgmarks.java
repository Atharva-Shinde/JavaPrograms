package Arrays;

import java.util.Scanner;

public class Avgmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter noof stu");
		int n = sc.nextInt();
		double sum = 0;
		double avg = 0;
		
		System.out.println("enter marks");
		int marks[]  = new int[n];
		for(int i=0;i<=n-1;i++) {
			marks[i]=sc.nextInt();
			
		}
		for (int i =0;i<n; i++) {
		
			sum = marks[i]+ sum;
			
		}
		avg = sum /n;
		System.out.println("average of marks is");
		System.out.println(avg);
		
		
	}
}





