import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean check(String str) {
		boolean check[] = new boolean[26];
		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			int input = str.charAt(i);
			if (temp != input) {
				if (!check[input - 'a']) {
					check[input - 'a'] = true;
					temp = input;
				} else
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if (check(str))
				result++;
		}
		System.out.println(result);
	}
}
