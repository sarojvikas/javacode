class CrossPattern
{
	public static void main(String[] args)
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);

	System.out.println("Enter the total number (<-odd no only -> )of line .. !");
	int n=sc.nextInt();

	if(n%2==1)
	{

	for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j || i+j==n+1)
				{
				System.out.print("*");
				}

				else
				{
				System.out.print(" ");
				}
			}
		System.out.println();
		}
	}

	else
	{
	System.out.println(n + " is not a odd number.. Please type a odd number .");
	}
	
	}
}
