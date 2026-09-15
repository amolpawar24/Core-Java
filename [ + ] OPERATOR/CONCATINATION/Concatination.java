class Concatination
{
	public static void main(String[] args) 
	{
		int a = 10;
		char ch = 'A';
		float var = 24.22f;
		boolean check = true;
		String str = "Hello";

		System.out.println(a+str);
		System.out.println(ch+str);
		System.out.println(var+str);
		System.out.println(check+str);
		System.out.println(str+str);
	}
}
/*
		********** NOTE *******
		int + string => string
		char + string => string
		float + string => string
		boolean + string => string


*/