import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String line = br.readLine();
			if(line.equals(".")) break;
			
			Stack<Character> stack = new Stack<>();
			boolean ok = true;
			
			for(char ch : line.toCharArray()) {
				if(ch == '(' || ch == '[') {
					stack.push(ch);
				}
				else if(ch == ')') {
					if(stack.isEmpty() || stack.pop() == '[') {
						ok = false;
						break;
					}
				}
				else if(ch == ']') {
					if(stack.isEmpty() || stack.pop() == '(') {
						ok = false;
						break;
					}
				}
				
			}
			if(!stack.isEmpty()) ok = false;
			
			bw.write(ok ? "yes\n" : "no\n");
			
		}
		
		bw.flush();

	}

}
