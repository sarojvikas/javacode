class PrimeNumber
{
	public static void main(String[] args)
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);

	int count=0;

	System.out.println("Enter the number to b checked .. ");
	int n=sc.nextInt(); //13

/*

	for(int i=1;i<=n;i++) 		// (count == 2)
		{	
		if(n%i==0)	// i is a factor n
			{
			count = count + 1;
			}
		}

*/

/*

	for(int i=1;i<=n/2;i++)		// (count == 1)
		{	
		if(n%i==0)	// i is a factor n
			{
			count = count + 1;
			}
		}
*/


	for(int i=2;i<=n/2;i++)		// (count == 0)
		{	
		if(n%i==0)	// i is a factor n
			{
			count = count + 1;
			}
		}


	if(count == 0)
	{
	System.out.println(n + " is a prime number ");
	}

	else 
	{
	System.out.println(n + " is not a prime number ");
	}

	}
}

		