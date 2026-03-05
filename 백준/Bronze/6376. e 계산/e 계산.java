import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("n e\n");
		bw.write("- -----------\n");
		for(int i = 1; i <= 10; i++) {
			double e = 0;
			for(int k = 0; k < i; k++) {
				e += (1.0 / fac(k));
			}
			if(i < 3) {
				bw.write(String.format("%d %.0f\n", i-1, e));
			} else if(i == 3) {
				bw.write(i-1 + " " + e + "\n");
			} else {
				bw.write(String.format("%d %.9f\n", i-1, e));
			}
		}
		
		bw.flush();
		

	}
	
	public static double fac(int a) {
		double facA = 1;
		for(int k = a; k > 0; k--) {
			facA *= k;
		}
		
		return facA;
	}

}
