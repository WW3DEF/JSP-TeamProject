package prj;

import java.util.Scanner;

public class prj5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"dan");
				System.out.println(i +  "x"  + j +  "=" + i*j);
			}
			System.out.println("===================");
		}
	}

}
