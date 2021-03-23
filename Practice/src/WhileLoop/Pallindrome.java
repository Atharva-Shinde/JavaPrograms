package WhileLoop;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int reverse = 0;
	int num = n;
	while(num>0) {
		int last = num%10;
		reverse = reverse*10 + last;
		num = num/10;
		
		System.out.println(num + " "+last+" " + reverse);
		}
if(reverse == n)
	System.out.println("pallindrome");
else {
	System.out.println("not a pallindrome");
}
	}

}
