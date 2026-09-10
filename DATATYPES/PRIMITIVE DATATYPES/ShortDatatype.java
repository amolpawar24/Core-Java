class ShortDatatype {

    public static void main(String[] args) {

        short sh = 35;

        short a = 32767;   // Maximum Range
        short b = -32768;  // Minimum Range

        // CTE: Incompatible types - possible lossy conversion from int to short
        //short c = 32768;

        // CTE: Incompatible types - possible lossy conversion from int to short
        //short d = -32769;

        System.out.println(sh);
    }
}

/*
 * Range: -32,768 to 32,767
 * Size: 16 bits = 2 bytes
 */