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
		for(int i = 0; i < M; i++) {
			j_size *= N;
		}
		answers = new String[j_size];
		
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
		if(depth == m) {
			for(int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			answers[j] = sb.toString();
			j++;
			sb.setLength(0);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			arr[depth] = i + 1;
			dfs(n, m, depth + 1);
		}
		
	}

}
