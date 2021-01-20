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
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		System.out.print("<");
		
		while(queue.size() != 1) {
			for (int j = 0; j < k - 1; j++) {
				queue.add(queue.poll());
			}
			System.out.print(queue.poll() + ", ");
		}
		System.out.println(queue.poll() + ">");
		}
	}
