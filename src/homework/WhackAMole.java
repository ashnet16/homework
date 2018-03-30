import java.util.Scanner;

public class WhackAMole {
	int scores;
	int molesLeft;
	int attemptsLeft;
	char [] [] moleGrid;
	
	WhackAMole(int numAttempts, int gridDimensions){
		moleGrid = new char [gridDimensions][gridDimensions];
		for (char[] x: moleGrid) {
		    for (int i = 0; i < x.length; i++) {
		    	    x[i] = '*';
			}
			
		}
		attemptsLeft = numAttempts;
		molesLeft = 0;
		System.out.println("You have the following total attempts " + attemptsLeft);
	}
	
	public boolean place(int x, int y) {
		System.out.println("Inserting mole at " + x + " " + y );
		try {
			if (moleGrid[x][y] == '*') {
				moleGrid[x][y] = 'M';
				molesLeft ++;
				System.out.println(molesLeft);
				return true;
			} else {
				return false;
				
				
			}
		    
		    
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter enter coordiates between 0-9");
			return false;
		} 
	}
	
	public void whack(int x, int y) {
		System.out.println("Whack");
		try {
		    if (moleGrid[x][y] == '*') {
		    	    this.attemptsLeft--;
		    } else {
		    	    System.out.println("Congrats, you've wacked a mole.");
		    		moleGrid[x][y] = 'W';
		    	    scores++;
		    	    attemptsLeft--;
		    	    molesLeft--;
		    }
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter enter coordiates between 0-9.");
			
		}
     }
	
	public void printGridToUser() {
		for ( char[] x: this.moleGrid) {
			for (char y : x) {
				if (y != 'M') {
				    System.out.println(y);
				}
			}	
		}	
	}
	
	public void printGrid() {
		for ( char[] x: this.moleGrid) {
			for (char y : x) {
				System.out.println(y);
			}	
		}
		
		
	}
	public static void main(String[] args) {
		WhackAMole test = new WhackAMole(50,10);
		test.place(0,4);
		test.place(1,3);
		test.place(8,5);
		test.place(4,5);
		test.place(3,9);
		test.place(9,4);
		test.place(7,6);
		test.place(2,1);
		test.place(5,7);
		test.place(6,6);
		
		Scanner whackLocation = new Scanner(System.in);
		while (test.molesLeft > 0) {
			System.out.println("The number of attempts you have left : " + test.attemptsLeft);
			System.out.println("Enter x coordinates:" );
			int x = whackLocation.nextInt();
			System.out.println("Enter y coordinates:" );
			int y = whackLocation.nextInt();
			System.out.println("You've enter" + " " + x + " "+ "and"+ " " + y);
			if (x == -1 && y == -1) {
				System.out.println("Exiting game.....");
				break;
			}
			else {
				test.whack(x, y);
			}
		
		}
		


	}

}
