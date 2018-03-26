/*
  	ISYS 320
  	Name(s):Brian Williams
  	Date: 3/25/2018
*/

public class P13_NumbersRight {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int space = 1; space <= row * -1 + 5; space++) {
				System.out.print(" ");
			}
			for(int number = 1; number <= row; number++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}

}
