import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

	public static StringBuilder sb = new StringBuilder();
	public static boolean[] visited;
	public static int[] arr;
	public static String[] answers;
	public static int j = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		TreeSet<String> treeSet = new TreeSet<>();
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		
		visited = new boolean[N];
		arr = new int[M];
		int j_size = 1;
		for(int i = N; i > N - M; i--) {
			j_size *= i;
		}
		answers = new String[j_size];		//nPm 사이즈의 정답 배열 생성
		
		dfs(N, M, 0);
		
		Arrays.sort(answers);
		for(int i = 0; i < j_size; i++) {
			treeSet.add(answers[i]);
		}
		while(!treeSet.isEmpty()) {
			bw.write(treeSet.pollFirst() + "\n");
		}
		bw.flush();
		
	}
	
	public static void dfs(int n, int m, int depth) {
		int[] testCase = new int[m];
		if(depth == m) {
			for(int i = 0; i < m; i++) {
				testCase[i] = arr[i];
			}
			Arrays.sort(testCase);
			for(int i = 0; i < m; i++) {
				sb.append(testCase[i] + " ");
			}
			answers[j] = sb.toString();
			j++;
			sb.setLength(0);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				dfs(n, m, depth + 1);
				visited[i] = false;
			}
		}
		
	}

}
