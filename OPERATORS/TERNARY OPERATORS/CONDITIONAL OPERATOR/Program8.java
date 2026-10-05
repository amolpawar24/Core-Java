class Program8 
{
	public static void main(String[] args) 
	{
		int a=15;
		int b=4;
		int c=24;
		int d=7;
		String res = a>b && a>c && a>d ? "A is Greater" : b>a && b>c && b>d ? "B is Greater " : c>a && c>b && c>d ? "C is Greater" :"D is Greater";
		System.out.println(res);

	}
}
