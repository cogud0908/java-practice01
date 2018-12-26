package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");

		int number = sc.nextInt();
		int result = 0;
		
		if (number % 2 == 0) {
			
			while(number > 0)
			{
				if(number % 2 == 0)
				{
					result += number;
				}
				number--;
			}
		}
		else
		{
			while(number > 0)
			{
				if(number % 2 == 1)
				{
					result += number;
				}
				number--;
			}
		}
		System.out.println("결과 값 : "+result);
	}
}
