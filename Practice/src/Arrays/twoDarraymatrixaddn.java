package Arrays;

import java.util.Scanner;

public class twoDarraymatrixaddn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("rows");
		int rows = sc.nextInt();
		System.out.println("cols");
		int cols = sc.nextInt();
		int a[][]= new int[rows][cols];
		int b[][]= new int[rows][cols];
		int c[][]= new int[rows][cols];
		System.out.println("a");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
			a[i][j]= sc.nextInt();	
			}
		System.out.println("b");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
			b[i][j]= sc.nextInt();	
			}
		System.out.println("c is");
		for(int i= 0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				c[i][j] = a[i][j]+b[i][j];
		}
		
		for(int i= 0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.println(c[i][j]);
		}

		
		
	
	
	
	}
	
}
