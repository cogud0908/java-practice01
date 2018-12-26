package practice01;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = new String(sc.nextLine());
		
		int num = 0;
		
		while(num < str.length())
		{
			for(int j = 0; j <= num; j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println("");
			num++;
		}
	}

}
