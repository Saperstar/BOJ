import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = 0;
		int max = 0;
		int maxIndex = 0;
		
		String line = sc.nextLine();
		line = line.toUpperCase();
		int arr[] = new int[100];
		Arrays.fill(arr,0);
		
		
		for(int i=0; i<line.length(); i++) {
			arr[(int)line.charAt(i)]++;
		}
		for(int i=0; i<100; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		int maxIndex1 = maxIndex;
		max = 0;
		for(int i=99; i>0; i--) {
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		if(maxIndex1!=maxIndex) {
			System.out.println("?");
		}
		else {
			char ans = (char)maxIndex;
			System.out.println(ans);
		}
		
		
		
		
		sc.close();
	}

}
