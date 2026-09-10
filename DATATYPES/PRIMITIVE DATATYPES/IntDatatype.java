class IntDatatype 
{
	public static void main(String[] args) 
	{
		int var;//
		//System.out.println(var);//CTE : variable b might not have been initialized
		//For Local Varaible Assigning value to the variable is mandatory.
		//At the time of Accessing.
	
		int a = 10;//We can declare the Integer Value using int Datatype.
		int b = 20;
		
		System.out.println(a);
		System.out.println(123);//Integer
		System.out.println(12+12);//Addition
		System.out.println(2*2);
		System.out.println(5-3);
		System.out.println(8/4);
		System.out.println(12%4);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		int c=5,d=3,e=11,f=25;
		//We declare or Initialize variable in Same line
		System.out.println(c);

		int g=2147483647;//Thats Max Range
		int h=-2147483648;//That Min Range
	//	int i=2147483647;//CTE : integer number too large: 19999999999
	//	int j=2147483648;//CTE : integer number too large: 19999999999
	}
}

/* Range : -2,147,483,648 to 2,147,483,647 */
/* Size = 32bits = 4 byte*/