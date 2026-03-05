import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<HashSet<Integer>> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        for(int i = 0; i <= N; i++) list.add(new HashSet<>());
        
        for(int i = 0; i < M; i++) {
        		line = br.readLine().split(" ");
        		int a = Integer.parseInt(line[0]);
        		int b = Integer.parseInt(line[1]);
        		list.get(a).add(b);
        }
        
        int[] howLine = new int[N+1];
        for(int i = 1; i <= N; i++) {
        		for(int x : list.get(i)) howLine[x]++;
        }
        
        for(int i = 1; i <= N; i++) if(howLine[i] == 0) q.add(i);
        
        while(!q.isEmpty()) {
        		int tem = q.poll();
        		bw.write(tem + " ");
        		for(int next : list.get(tem)) {
        			howLine[next]--;
        			if(howLine[next] == 0) q.add(next);
        		}
        }
        
        
        bw.flush();
    }

}
