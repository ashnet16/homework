package homework;

public class Squarelotron {
	int[][] squarelotron;
	static int size;
	
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
	public static int totalRings() {
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
		for (int x = 0; x <= size-1; x++) {
			for (int y = 0; y <=size-1; y++) {
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
		int startPosition = ring - 1;
		int endPosition = size - ring;
		Squarelotron squareUDP = new Squarelotron(size);
		for (int x = 0; x <= size-1;x++) {
			for (int y = 0; y <=size-1;y++) {
				if (x == startPosition) {
					squareUDP.squarelotron[y][startPosition] = this.squarelotron[x][y];
				}else if (x == endPosition) {
					squareUDP.squarelotron[y][endPosition] = this.squarelotron[x][y];

				}else {
					if (y == startPosition || y == endPosition ) {
						squareUDP.squarelotron[y][x] = this.squarelotron[x][y];
						
					}
				}
				
				
			}
				
		}
		return squareUDP;	
	}
	
	public void rotateRightOnce() {
		int totalNumRings = totalRings();
		int ringTrack = 1;
		while (totalNumRings > 0) {
			int startPosition = ringTrack - 1;
			int endPosition = size - ringTrack;
			Squarelotron squareUDP = new Squarelotron(size);
			for (int x = 0; x <= size-1; x++) {
				for (int y = 0; y<= size-1; y++) {
					if (x == startPosition) {
						this.squarelotron[y][endPosition] = squareUDP.squarelotron[x][y];
					}else if (x == endPosition) {
						this.squarelotron[y][startPosition] = squareUDP.squarelotron[x][y];
					}
					else {
			    			if (y == startPosition || y == endPosition) {
			    				this.squarelotron[y][(size-1)-x] = squareUDP.squarelotron[x][y];
			    			}
					}
				}
				
			}
			totalNumRings = totalNumRings-1;
			ringTrack = ringTrack + 1;
		}
	}
	
	public void rotateRight() {
		
		
		
	}


	public static void main(String[] args) {
		Squarelotron test = new Squarelotron(5);
		test.rotateRightOnce();
		for (int x = 0; x <= size-1; x++) {
			for (int y = 0; y <=size-1;y++) {
				System.out.println(test.squarelotron[x][y]);
			}
			
			
		}
	    
		

	}

}
