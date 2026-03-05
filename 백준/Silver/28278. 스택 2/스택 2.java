import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    		Deque<Integer> dq = new ArrayDeque<>();
    		
    		int N = Integer.parseInt(br.readLine());
    		for(int i = 0; i < N; i++) {
    			String[] line = br.readLine().split(" ");
    			int x = Integer.parseInt(line[0]);
    			switch(x) {
    			case 1:
    				dq.addLast(Integer.parseInt(line[1]));
    				break;
    			case 2:
    				if(!dq.isEmpty()) bw.write(dq.pollLast() + "\n");
    				else bw.write("-1\n");
    				break;
    			case 3:
    				bw.write(dq.size() + "\n");
    				break;
    			case 4:
    				if(dq.isEmpty()) bw.write("1\n");
    				else bw.write("0\n");
    				break;
    			case 5:
    				if(!dq.isEmpty()) bw.write(dq.peekLast() + "\n");
    				else bw.write("-1\n");
    				break;
    			}
    			
    		}
    		
    		
    		bw.flush();
    }

}
