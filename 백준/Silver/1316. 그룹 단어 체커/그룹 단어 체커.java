import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = new String();
		int ans = 0;
		int N = sc.nextInt();
		sc.nextLine();
		for(int k = 0; k < N; k++) {
			line = sc.nextLine();
			int[] arr = new int[50];
			boolean isAnswer = true;
            for(int i = 1; i < line.length() + 1; i++) {
            	if(i == line.length()) {
            		int c = line.charAt(line.length() - 1);
            		if(arr[c - 'a'] == 1) isAnswer = false;
            		break;
            	}
                char a = line.charAt(i - 1);
                char b = line.charAt(i);
                
                if(b != a) {
                    if(arr[a - 'a'] == 1) {
                        isAnswer = false;
                        break;
                    }
                    arr[a - 'a'] = 1;
                }
            }
            if(isAnswer) ans++;
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}

