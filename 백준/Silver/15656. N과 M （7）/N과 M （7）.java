import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    static int N, M;
    static int[] nums;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        M = Integer.parseInt(line[1]);

        nums = new int[N];
        visited = new boolean[N];
        arr = new int[M];

        line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(nums);

        dfs(0);

        bw.write(sb.toString());
        bw.flush();
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = nums[i];
            dfs(depth + 1);
        }
    }
}
