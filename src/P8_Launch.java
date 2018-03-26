/*
  	ISYS 320
  	Name(s):Brian Williams
  	Date: 3/25/2018
*/

// 1. Your predicted output 
/*
 T-minus is printed with println, the numbers aren't, and blastoff is.
 That would mean it would likely look like
 T-minus
 5, 4, 3, 2, 1, Blastoff!
 
 */


public class P8_Launch {

	public static void main(String[] args) {
        System.out.println("T-minus ");
        for( int i = 5; i >= 1; i-- ) {
            System.out.print( i + ", " );
        }
        System.out.println("Blastoff!");
	}

}



// 3. Were you correct? Explain any differences and what you learned.
// I was correct.