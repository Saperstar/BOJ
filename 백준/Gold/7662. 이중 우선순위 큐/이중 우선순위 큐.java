import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
        	TreeMap<Integer, Integer> map = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            for (int x = 0; x < k; x++) {
                String[] line = br.readLine().split(" ");
                String how = line[0];
                int what = Integer.parseInt(line[1]);
                
                if (how.equals("I")) {
                    map.put(what, map.getOrDefault(what, 0) + 1);
                }
                else {
                    if (map.isEmpty()) continue;
                    int target = (what == 1) ? map.lastKey() : map.firstKey();
                    
                    if (map.get(target) == 1) map.remove(target);
                    else map.put(target, map.get(target) - 1);
                }
            }
            
            if (map.isEmpty()) bw.write("EMPTY\n");
            else bw.write(map.lastKey() + " " + map.firstKey() + "\n");
        }
        bw.flush();
    }
}