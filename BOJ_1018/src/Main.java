import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static String[][] chess1 = {
			{"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"}
	};
	
	public static String[][] chess2 = {
			{"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"}
	};
	
	public static int comparing(String[][] arr, String[][] chess, int n, int m) {
		int result = 0;
		for (int i = n; i < n + 8; i++)
			for (int j = m; j < m + 8; j++)
				if (!arr[i][j].equals(chess[i-n][j-m]))
					result++;
		return result;
	}
	
	public static int min(int a, int b, int c) {
		 int result = a < b ? (a < c ? a : c) : (b < c ? b : c);
	     return result;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[][] input = new String[N][M];
		int result = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				input[i][j] = str.substring(j, j+1);
			}
		}

		for (int i = 0; i + 7 < N; i++) 
			for (int j = 0; j + 7 < M; j++)
				result = min(result, comparing(input, chess1,  i, j), comparing(input, chess2, i, j));

		System.out.println(result);
	}
}
