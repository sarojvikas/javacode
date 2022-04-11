import java.util.Scanner;
class PrimeNoWithMethod
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the number to b checked .. !");
	int n=sc.nextInt();

		if(PrimeNoWithMethod.checkPrime(n) == 1)
		{
		System.out.println(n + " is a prime number");
		}

		else
		{
		System.out.println(n + " is not a prime number");
		}

	}


	static int checkPrime(int n)
	{
		if(n<=1)
		{
		return 0;
		}

		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
			return 0;
			}
		}

		return 1;
	} 
}
	