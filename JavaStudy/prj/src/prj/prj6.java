package prj;

import java.util.Scanner;

public class prj6 {
	/*
	 == 는 같다
	 >= 크거나 같다
	 > 크다
	 <= 작거나 같다
	 < 작다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  if(조건문) {
		  	만약 참일시 실행될 문장
		  } else {
		  	만약 거짓일시 실행될 문장
		  }
		 */
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		if (A > 5) {
			System.out.println("bigger than 5");
		} else if( A == 5 ) {
			System.out.println("A is 5 ");
		}
		else {
			System.out.println("smaller than 5");
		}
	}

}
