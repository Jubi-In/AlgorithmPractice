import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static String solution(String str, int idx1, int idx2) {
		String result = null;
		result = reverse(str.substring(0, idx1+1));
		result += reverse(str.substring(idx1+1, idx2+1));
		result += reverse(str.substring(idx2+1, str.length()));
		return result;
	}
	
	public static String reverse(String str) {
		return (new StringBuffer(str).reverse().toString());
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String result = solution(str, 0, 1);
		
		for (int i = 0; i < str.length() - 2; i++) {
			for (int j = i+1; j < str.length()-1; j++) {
				String temp = solution(str, i, j);
				if (result.compareTo(temp) > 0)
					result = temp;
			}
		}
		System.out.println(result);
	}
}
