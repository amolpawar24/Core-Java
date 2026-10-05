class Program7 
{
	public static void main(String[] args) 
	{
		int a=15;
		int b=7;
		int c=24;

		String res = a>b && a>c ? "A is Greater" : b>a && b>c ? "B is Greater" :"C is Greater";
		System.out.println(res);
	}
}
