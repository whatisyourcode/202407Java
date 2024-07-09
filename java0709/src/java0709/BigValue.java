package java0709;

import java.util.Scanner;

public class BigValue {

	public static int getNumber(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input); 
	}
	
	public static void printNumber(int num1,int num2) {
		if(num1 > num2) {
			System.out.printf("첫번째 값이 더 크다 -> %d > %d",num1,num2);
		}else if(num1 < num2) {
			System.out.printf("두번째 값이 더 크다 -> %d < %d",num1,num2);
		}else {
			System.out.printf("값이 같다 -> %d == %d",num1,num2);
		}
	}
	
	public static void main(String[] args) {
		
		int num1 =0;
		int num2 =0;
		
		Scanner sc = new Scanner(System.in);
		num1 = getNumber("첫번째 값 입력 : ",sc);
		num2 = getNumber("두번째 값 입력 : ",sc);

		printNumber(num1,num2);
	}

}
