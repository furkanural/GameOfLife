
public class GameOfLife {
	boolean[][] grid;		//hücrenin o anki durumu saklanýr.
	boolean[][] tempGrid;	//geçici hücre bilgisi saklanýr.
	
	public GameOfLife(boolean[][] temp)
	{
		grid=new boolean[temp.length][temp[0].length];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				grid[i][j]=temp[i][j];
			}
		}
	}
	
	public void nextGeneration()
	{
		int count=0;
		tempGrid=new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				try{
				if(grid[i-1][j]) {count++;}
				}catch(ArrayIndexOutOfBoundsException e){
				}
				try{
				if(grid[i-1][j-1]) {count++;}
				}catch(ArrayIndexOutOfBoundsException e){
				}
				try{
				if(grid[i-1][j+1]) {count++;}
				}catch(ArrayIndexOutOfBoundsException e){
				}
				try{
				if(grid[i][j-1]) {count++;}
				}catch(ArrayIndexOutOfBoundsException e){
				}
				try{
				if(grid[i][j+1]) {count++;}
				}catch(ArrayIndexOutOfBoundsException e){
				}
				try{
				if(grid[i+1][j]) {count++;}
				}catch(ArrayIndexOutOfBoundsException e){
				}
				try{
				if(grid[i+1][j+1]) {count++;}
				}catch(ArrayIndexOutOfBoundsException e){
				}
				try{
				if(grid[i+1][j-1]) {count++;}
				}catch(ArrayIndexOutOfBoundsException e){
				}
				
				if(grid[i][j])
				{
					if(count < 2 || count > 3)
						tempGrid[i][j]=false;
					else
						tempGrid[i][j]=true;
				}else
				{
					if(count == 3)
						tempGrid[i][j]=true;
				}
				count = 0;
				}
			}
		for (int i=0; i < grid.length;i++) {
			for(int j=0; j<grid[0].length;j++){
				grid[i][j]=tempGrid[i][j];
			}
		}
	}
	
	public void displayGrid()
	{
		for (boolean[] bs : grid) {
			for (boolean b : bs) {
				System.out.printf("%s ", b ? "*" : "_");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
}