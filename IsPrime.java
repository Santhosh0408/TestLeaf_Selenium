package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=31;
		
		for (int i=2; i<p;) 
		{
			if (p%i ==0)
			{
				System.out.println("Given number is Not a Prime Number");
				break;
			}
			
			else
			{
				System.out.println("Given number is a Prime Number");
				break;
			}
				
		}
	}
}
