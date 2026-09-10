class ProgramStructure
{

	static int a=10;
	//System.out.println(a);//CTE :  error: <identifier> expected
	

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/* ********** NOTE ******
==>We cannot write a printing statement in class block.
==>Because class contains:
1.Global Vriables(Static/Non-Static)
2.Methods(Static/Non-Static)
3.Constructors(No-Args/Parameterized)
4.Block(Static/Non-Static)
5.Main Method
*/