//QNO15:-Write A Program To Convert The Char To Byte
class CharToByte 
{
	public static void main(String[] args) 
	{
		char ch='a';

		byte b=(byte)ch; 
		System.out.println(b);

	}
}
/****************************************************************************************
==>CharToByte.java:8: error: incompatible types: possible lossy conversion from char to byte
                byte b=ch;
                       ^
1 error
==>We cannot convert the char to Byte Data beacuse char has Big Length.
==>If you want convert then we need take the help of cast operator.
==>char is unsigned (has a range of 0 to 2^16 - 1), so -1 is not within its range.
==>byte, on the other hand, is signed, and has a range of -128 to 127. 
****************************************************************************************/
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>97								*
*************************************/
