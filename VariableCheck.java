class VariableCheck
{
	
	static String subject;
	String name;
	int sid;

	public static void main(String[] args)
	{
	// int n=0;
	
	VariableCheck v1=new VariableCheck();

	v1.name="Rohit Sharma";
	v1.sid=1;

	System.out.println(v1.name);   //  null
	System.out.println(new VariableCheck().sid);    //  0
	System.out.println(subject);   // null
	}
}