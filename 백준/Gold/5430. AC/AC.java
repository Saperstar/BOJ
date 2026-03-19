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
        
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
        	Deque<Integer> q = new ArrayDeque<>();
        	String p = br.readLine();
        	int n = Integer.parseInt(br.readLine());
        	String line = br.readLine();
        	String[] lines = new String[n];
        	boolean isError = false;
        	boolean reverse = false;
        	if(line.length() > 2) lines = line.substring(1, line.length()-1).split(",");
        	for(int k = 0; k < n; k++) q.add(Integer.parseInt(lines[k]));
        	
        	for(int k = 0; k < p.length(); k++) {
        		if(isError) break;
        		switch(p.charAt(k)) {
        		case 'R':
        			if(reverse) reverse = false;
        			else reverse = true;
        			break;
        		case 'D':
        			if(q.isEmpty()) {
        				isError = true;
        				break;
        			}
        			if(!reverse) q.pollFirst();
        			else q.pollLast();
        			break;
        		}
        	}
        	if(isError) bw.write("error\n");
        	else if(q.isEmpty()) bw.write("[]\n");
        	else {
        		bw.write("[");
        		int qSize = q.size();
        		for(int k = 0; k < qSize - 1; k++) {
        			if(!reverse) bw.write(q.pollFirst() + ",");
        			else bw.write(q.pollLast() + ",");
        		}
        		bw.write(q.poll() + "]\n");
        	}
        }
    	bw.flush();
    	
    }
}