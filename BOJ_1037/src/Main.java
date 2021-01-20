import java.util.*;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int cnt = scan.nextInt();
		int[] arr = new int[cnt];
		
		
		for (int i = 0; i < cnt; i++) {
			int n = scan.nextInt();
			arr[i] = n;
		}
		Arrays.sort(arr);
		System.out.println(arr[0] * arr[cnt-1]);
	}
}
