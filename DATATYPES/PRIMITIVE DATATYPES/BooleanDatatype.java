class BooleanDatatype 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 5;
		int c = 11;
		int d = 24;

		boolean bool = true;
		System.out.println(a > b);
		System.out.println(a <= b);
		//System.out.println(true+false);//CTE : bad operand types for binary operator '+'

	}
}
/* Size = 1 bit */
//boolean Value Give Only true & false.
//If it is right ==>true.
//if it is wrong ==>false.

/*
	*************** NOTE ******************
	int + boolean = CTE[ Compile Time Error ]
	char + boolean = CTE[ Compile Time Error ]
	boolean + boolean = CTE[ Compile Time Error ]
	boolean + boolean = CTE[ Compile Time Error ]

*/