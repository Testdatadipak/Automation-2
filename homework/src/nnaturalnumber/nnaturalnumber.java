package nnaturalnumber;

public class nnaturalnumber {

	 static int sum(int n) 
		// TODO Auto-generated method stub
		{
if(n==1)
	return 1;
else
	return n+sum(n-1);
	}
	public static void main(String[] args)
	{
	System.out.println(sum(13));


}

}