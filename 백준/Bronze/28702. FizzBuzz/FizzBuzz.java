import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line1 = br.readLine();
		String line2 = br.readLine();
		String line3 = br.readLine();
		int ansNum = 0;
		if(!line1.equals("Fizz") && !line1.equals("Buzz") && !line1.equals("FizzBuzz")) {
			ansNum = Integer.parseInt(line1) + 3;
		}
		if(!line2.equals("Fizz") && !line2.equals("Buzz") && !line2.equals("FizzBuzz")) {
			ansNum = Integer.parseInt(line2) + 2;
		}
		if(!line3.equals("Fizz") && !line3.equals("Buzz") && !line3.equals("FizzBuzz")) {
			ansNum = Integer.parseInt(line3) + 1;
		}
		if(ansNum % 3 == 0 && ansNum % 5 == 0) bw.write("FizzBuzz");
		else if(ansNum % 3 == 0 && ansNum % 5 != 0) bw.write("Fizz");
		else if(ansNum % 3 != 0 && ansNum % 5 == 0) bw.write("Buzz");
		else bw.write(ansNum + " ");
		bw.flush();

	}

}
