package practice01;

public class Prob5 {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		for(int i = 1; i <= 99; i++)
		{
			if((i > 10 && ((i / 10) * 10) % 3 == 0) && i % 3 == 0)
				System.out.println(i+ " 짝짝");
			else if(i > 10 && ((i / 10) * 10) % 3 == 0)
				System.out.println(i+" 짝");
			else if(i % 3 == 0)
				System.out.println(i+" 짝");
			
		}
	}
}
