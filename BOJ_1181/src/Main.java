import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());

		String[] inputArr = new String[n];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			inputArr[i] = str;
		}

		
		Arrays.sort(inputArr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(inputArr[0]).append('\n');
		
		for (int i = 1; i < n; i++) {
			if (!inputArr[i].equals(inputArr[i-1])) {
				sb.append(inputArr[i]).append('\n');
			}
		}
		System.out.println(sb);
		br.close();
	}
}
