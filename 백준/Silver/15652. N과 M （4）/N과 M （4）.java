import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

	public static TreeSet<String> treeSet = new TreeSet<>();
	public static StringBuilder sb = new StringBuilder();
	public static int[] arr;
	public static int[] testCase;
	public static String[] answers;
	public static int j = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		
		arr = new int[M];
		testCase = new int[M];
		int size = 1;
		for(int i = 0; i < M; i++) {
			size *= N;
		}
		answers = new String[size];
		
		dfs(N, M, 0);
		
		for(String s : answers) {
			if(s != null) bw.write(s + "\n");
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
			if(depth == 0 || i + 1 >= arr[depth - 1]) {
				arr[depth] = i + 1;
				dfs(n, m, depth + 1);
			}
		}
		
	}

}
