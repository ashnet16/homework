package homework;

public class Squarelotron {
	int[][] squarelotron;
	int size;
	
	public Squarelotron(int n) {
		size = n;
		int num = 1;
		squarelotron = new int[size][size];
		for (int[] x: squarelotron) {
			for (int i = 0; i< x.length;i++) {
				x[i] = num;
				num++;	
			} 
			
		}	
	}
	public int totalRings() {
		int dimension = size;
		double isOdd = dimension%2;
		if ( isOdd == 0) {
		    return dimension/2;
		}else {
			return (dimension/2) + 1;
		}
	}
	public Squarelotron upsideDownFlip(int ring) {
		int startPosition = ring - 1;
		int endPosition = size - ring;
		Squarelotron squareUDP = new Squarelotron(size);
		for (int x = 0; x <= size-1;x++) {
			for (int y = 0; y <=size-1;y++) {
				if (x == startPosition) {
					squareUDP.squarelotron[endPosition][y] = this.squarelotron[x][y];
				}else if (x == endPosition) {
					squareUDP.squarelotron[startPosition][y] = this.squarelotron[x][y];

				}else {
					if (y == startPosition || y == endPosition ) {
						squareUDP.squarelotron[x][y] = this.squarelotron[(size-1)-x][y];
						
						
					}
				}
				
				
			}
				
		}
		return squareUDP;	
	}
	
	
	public Squarelotron mainDiagonalFlip(int ring) {
		return null;	
	}
	
	public Squarelotron rotateRight(int numberOfTurns) {
		return null;	
	}
	

	public static void main(String[] args) {
		Squarelotron test = new Squarelotron(4);
	    Squarelotron test2 = test.upsideDownFlip(1);
		for (int x=0; x < test2.squarelotron.length ; x++) {
			for ( int i=0; i < test2.squarelotron[x].length; i++) {
				System.out.println(test2.squarelotron[x][i]);
			}
		}
		
		

	}

}
