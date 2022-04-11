import java.util.Scanner;
class PrimeSum
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);

	int sum=0;

	System.out.println("Enter the range..");
	int n=sc.nextInt();
	int m=sc.nextInt();

		for(int i=n;i<=m;i++)
		{
		if(PrimeSum.checkPrime(i)==1)
			{
			sum=sum+i;
			System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print(sum );

	}


	private static int checkPrime(int n)
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
	