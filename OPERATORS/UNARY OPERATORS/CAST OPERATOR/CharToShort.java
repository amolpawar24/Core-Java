//QNO16:-Write A Program To Convert The Char To Short
class CharToShort 
{
	public static void main(String[] args) 
	{
		char ch='a';
		short b=(short)ch;
		System.out.println(b);
	}
}
/*********************************S*******************************************************
==>CharToShort.java:7: error: incompatible types: possible lossy conversion from char to short
                short a=ch;
                        ^
1 error
==>We cannot convert the char Datatype to short.
==>If you trying to convert char to short then compiler will throw error.
==>short is signed type of bits
==>Note that though short and char have the same size. Still, the conversion from short to char is lossy because char is an unsigned data type.
****************************************************************************************/
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>97								*
*************************************/
