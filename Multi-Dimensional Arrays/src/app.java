
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = {1, 4, 6, 243}; //One dimensional array
		System.out.println(values[3]);
		
		int[][] grid = {
				{1, 4, 6, 243},
				{4, 1, 3},
				{1, 2, 200}
		};
		
		System.out.println(grid[1][2]);
		
		
		String[][] texts = new String[2][3];
		texts[0][2] = "Hi there!";
		System.out.println(texts[0][2]);
		
		for(int row=0; row < grid.length; row++) {
			for(int col=0; col < grid.length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
