package com.preplaced.exercise.patterns;
import java.util.*;

public class Main {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	System.out.print("Please enter number: ");
	int userInput = sc.nextInt();
	
	// pattern 15
	reverseLeftHalfPyramid(userInput);
	
	// pattern 14
	//leftHalfPyramidPattern(userInput);
	
	// pattern 13
	//reverseRightHalfPyramid(userInput);
	
	// pattern 12
	//rightHalfPyramidPattern(userInput);
	
	// pattern 11
	//squareFillPattern(userInput);
	
	// pattern 10
	//butterflyStarPattern(userInput);
	
	// pattern 9
	//diamondStarPattern(userInput);
	
	// pattern 8
	//rhombusPattern(userInput);
	
	// pattern 7
	//palindromeTriangle(userInput);
	
	// pattern 6
	//zeroOnePyramid(userInput);
	
	// pattern 5
	//numberChangingPyramid(userInput);
	
	// pattern 4
	//numberIncreasingReversePyramid(userInput);
	
	// pattern 3
	//numberIncreasingPyramid(userInput);
	
	// pattern 2
	//numberTrianglePattern(userInput);
	
	// pattern 1
	//squareHollowPattern(userInput);
	
	}
	
	private static void reverseLeftHalfPyramid(int userInput) {
		for(int row=userInput; row>=1; row--) {
			for(int col=1; col<=userInput-row; col++) {
				System.out.print(" ");
			}
			for(int col=row; col>=1; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void leftHalfPyramidPattern(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=userInput-row; col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void reverseRightHalfPyramid(int userInput) {
		for(int row=userInput; row>=1; row--) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void rightHalfPyramidPattern(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void squareFillPattern(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=userInput; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void butterflyStarPattern(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			for(int col=1; col<=2*(userInput-row); col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=userInput; row>=1; row--) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			for(int col=1; col<=2*(userInput-row); col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void diamondStarPattern(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=userInput-row; col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=(2*row-1); col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=userInput-1; row>=1; row--) {
			for(int col=1; col<=userInput-row; col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=(2*row-1); col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void rhombusPattern(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=userInput-row; col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=userInput; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void palindromeTriangle(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=userInput-row; col++) {
				System.out.print("  ");
			}
			for(int col=row; col>=1; col--) {
				System.out.print(col + " ");
			}
			for(int col=2; col<=row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private static void zeroOnePyramid(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=row; col++) {
				if((row + col)%2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

	private static void numberChangingPyramid(int userInput) {
		int temp = 1;
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
	}

	private static void numberIncreasingReversePyramid(int userInput) {
		for(int row=0; row<userInput; row++) {
			for(int col=1; col<=userInput-row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	private static void numberIncreasingPyramid(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	private static void numberTrianglePattern(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=userInput-row; col++) {
				System.out.print(" ");
			}
			for(int nCol=1; nCol<=row; nCol++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
	
	private static void squareHollowPattern(int userInput) {
		for(int row=1; row<=userInput; row++) {
			for(int col=1; col<=userInput; col++) {
				if(row==1 || row==userInput || col==1 || col==userInput) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
