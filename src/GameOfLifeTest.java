import java.util.Scanner;
public class GameOfLifeTest {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		boolean[][] a=new boolean[10][10];
		
		System.out.println("Canlı hücre sayisini giriniz");
		int number=input.nextInt();
		
		for(int i=0 ; i < number ; i++){
			System.out.println((i+1)+". hücre satır değeriz");
			int col=input.nextInt();
			System.out.println((i+1)+". sütun değer giriniz");
			int row=input.nextInt();
			a[col][row]=true;
		}
		
		System.out.println("kaç nesil sonrasını görmek istersiniz:");
		int sequence = input.nextInt();
		
		GameOfLife test = new GameOfLife(a);
		for(int i=0; i<sequence ; i++)
		{
			test.displayGrid();
			test.nextGeneration();
		}
		
	}

}