package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		 System.out.print("숫자를 입력하세요 : ");
		 
		 if(scanner.nextInt() % 3 == 0) { System.out.println("3의 배수입니다."); }
		
		scanner.close();
	}
}
