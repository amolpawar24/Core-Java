class ByteDatatype 
{
	public static void main(String[] args) 
	{
		byte a = 97;
		byte b = -128;//Min limit is -128
		byte c = 127;//Max limit is 127
		
		// CTE : ByteDatatype.java:9: error: incompatible types: possible lossy conversion from int to byte
		//byte d = -129;
		
		//byte e=128;//CTE :incompatible types: possible lossy conversion from int to byte

		System.out.println(b);
	}
}
/* Range : -128 to 127 */
/* Size = 8bits = 1 byte */