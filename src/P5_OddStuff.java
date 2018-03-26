/*
  	ISYS 320
  	Name(s):Brian Williams
  	Date: 3/25/2018
*/

// 1. Your predicted output 
/*
It seems that the for-loop won't have an effect on a number so small, so the output would likely be
4
2
 */


public class P5_OddStuff {

	public static void main(String[] args) {
        int number = 4;
        for( int count = 1; count <= number; count++ ) {
            System.out.println( number );
            number = number / 2;
        }
	}

}



// 3. Were you correct? Explain any differences and what you learned.
/*
I was correct.
*/