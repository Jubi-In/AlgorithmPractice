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
		int[] lenArr = new int[n];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			inputArr[i] = str;
			lenArr[i] = str.length();
		}

		Arrays.sort(inputArr, Comparator.comparing(String::length));

		for (int i = 0; i < n - 1; i++) {
			if (!inputArr[i].equals(inputArr[i + 1])) {
				if (inputArr[i].length() == inputArr[i + 1].length()) {
					Arrays.toString(inputArr);
					System.out.print(inputArr[i] + " ");
				}
				else
					System.out.print(inputArr[i] + " ");
			}
			if (!inputArr[n - 1].equals(inputArr[n - 2]))
				System.out.print(inputArr[n - 1] + " ");
		}

	}
}
