package leapyear;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2400;
		if(year%400==0)
		{
			System.out.println("leap year");
		}
		else if(year%4==0 && year%100!=0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
