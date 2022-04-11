import java.util.Scanner;
class PrimeSumAvg
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);

	int sum=0;
	int count=0;

	System.out.println("Enter the range..");
	int n=sc.nextInt();  	// 3
	int m=sc.nextInt();	// 12

		for(int i=n;i<=m;i++)  	// 3 5 7 11
		{
		if(PrimeSumAvg.checkPrime(i)==1)
			{
			sum=sum+i;
			count=count+1;			
			}
		}
		
		double avg =(double)sum/count;

		System.out.println(avg );
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
	