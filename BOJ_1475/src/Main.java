import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int check(String number) {
		boolean[] set = new boolean[10];
		int result = 1;
		for (int i = 0; i < number.length(); i++) {
			int num = number.charAt(i);
			if (!set[num - '0']) {
				set[num - '0'] = true;
			}
			else {
				if ((num - '0') == 6) {
					if (!set[9])
						set[9] = true;
					else {
						result++;
						set = new boolean[10];
						set[num -'0'] = true;
					}
				}
				else if ((num - '0') == 9) {
					if (!set[6])
						set[6] = true;
					else {
						result++;
						set = new boolean[10];
						set[num -'0'] = true;
					}
				}
				else {
					result++;
					set = new boolean[10];
					set[num -'0'] = true;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		check(number);
		System.out.println(check(number));
		
	}
}
