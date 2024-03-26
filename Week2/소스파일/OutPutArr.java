
public class OutPutArr {
	public static void main(String[] args) {
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		int firstnum = n.length;
		for(int i = 0; i < firstnum; i++) {
			int secondnum = n[i].length;
			for(int j = 0; j < secondnum; j++) {
				System.out.print(n[i][j]);
			}
			System.out.print("\n");
		}
	}

}
