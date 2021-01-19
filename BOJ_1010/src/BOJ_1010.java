import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_1010 {

	public static int solution(int n, int m, int[][] memo) {
		for (int i = 1; i < 31; i++)
			memo[1][i] = i;
		
		for (int i = 2; i <= 30; i++)
			for(int j = i; j <= 30; j++)
				for (int k = j; k >= i; k--)
					memo[i][j] += memo[i-1][k-1];
		
		return memo[n][m];
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(input.readLine());
		
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[][] memo = new int[31][31];

			output.write(String.valueOf(solution(n, m, memo)));
			output.newLine();
		}

		output.close();
		input.close();
	}
}
