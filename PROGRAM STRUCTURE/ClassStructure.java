class ClassStructure 
{//Class Block

	//Global Variable Declaration(Static/Non-Static)
	static	int a=10;
			//int a=10;//CTE : You cannot use same variable name in Same Block.
			int b=20;
			int sum=0;

	//Methods(Static/Non-Static)
	public static void display()
	{//Display Method Block
		ClassStructure obj1 = new ClassStructure();
		System.out.println("=================== DISPLAY METHOD STARTS ==================");
		System.out.println("This is Display() Method");

		int a=20;//Local Variable of display() Method
		System.out.println(a);//Access?local/Static/Non-Static
		System.out.println(ClassStructure.a);//Directly Global Static/Non-Static

		//demo();//CTE :non-static method demo() cannot be referenced from a static context

		{//Normal Block
			System.out.println("This is Normal Block From Static Method");
		}
			System.out.println("=================== DISPLAY METHOD ENDS ==================");
	}

	public void demo()
	{//Demo Method Block
		System.out.println("============== DEMO METHOD STARTS ===================");
		System.out.println("This is Demo() Method");
		System.out.println(a);//Local/Static/Non-Static
		System.out.println(this.a);//Global or Static Non-Static
		System.out.println(this.b);
		//System.out.println(Structure.b);//CTE : non-static variable b cannot be referenced from a static context
		System.out.println("============== DEMO METHOD ENDS ===================");
	}

	public static int sum()
	{
		int a=10;
		int b=20;
		return a + b;

	}

	//Blocks(Static/Non-Static)

	{
		System.out.println("=================== NON-STATIC BLOCK STARTS ==================");
		//Non-Static Block
		System.out.println("This is Non-Static Block");
		System.out.println("=================== NON-STATIC BLOCK ENDS ==================");
	}

	static
	{
		System.out.println("======================= STATIC BLOCK STARTS ===================");
		//Static BLock
		System.out.println("This is Static Block");
		System.out.println("======================= STATIC BLOCK ENDS =====================");
	}

	ClassStructure()
	{//No Args Constructor Blocks
		this(10,20);//Calling Parametrized Constructor
		System.out.println("============== NO-ARGS CONSTRUCTOR STARTS ==========================");
		//this();//CTE : this is recursive call
		//Compiler tells you are calling same constructor.You cannnot call same constructor
	

		//super();//CTE : You cannot use super() and this Together

		//this(10,20);//CTE :- this should be First Statement

		System.out.println("============== NO-ARGS CONSTRUCTOR ENDS ==========================");
	}

	ClassStructure(int a, int b)
	{//Parameterized Constructure

		System.out.println("============This is Parameterized Constructure=============");

		System.out.println(a);
		System.out.println("=============This is Parameterized Constructure============");
	}
	public static void main(String[] args) 
	{//Main Method Block
		System.out.println("================= MAIN METHOD STARTS ==============================");
		int a=20;

	//Object Creation
	//ClassName ObjectRef = new Keword ClassConstructor()	
		ClassStructure obj = new ClassStructure();//Calling No-Args Constructor
		System.out.println(obj);//Printing Object Address
	//When object is created then the Non-Static Members instanctiated / Executed
	//For Non-Static Members Object Creation is Mandatory.
	//1.Non-Static Block
	//2.Non-Static Variable
	//3.Non-Static Methods


		System.out.println("======================= Calling Static Method =============");
		// Calling Ways for Static
		display();//directly Name
		//2.obj.display();//Using Object Refernce
		//3.Structure.display();//Using Class Name as Reference
		//4.obj.demo();
		System.out.println(sum());//Calling From Printing Statement
		System.out.println("======================= Calling Static Method =============");
		//System.out.println(display());//CTE : return type required when calling from Printing Statement
		//System.out.println(obj.display());CTE : //return type required when calling from Printing Statement

		{
			//This is Normal BLock
			System.out.println("This is Normal Block");
			//System.out.println(this);//This block belongs to Static Method so cannot call Using this.
		}
	System.out.println("================= MAIN METHOD ENDS ==============================");
	}
}
