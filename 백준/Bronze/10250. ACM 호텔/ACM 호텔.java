import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt();	//층 수
			int W = sc.nextInt();	//방 수
			int N = sc.nextInt();	//손님 번호
			if(N <= H) System.out.println(100 * N + 1);
			else {
				int HN = N % H;			//손님 방의 앞자리
				int WN = N / H;			//손님 방의 뒷자리
				if(HN == 0) {
					HN = H;
				}
				else {
					WN++;
				}
				
				System.out.println(100 * HN + WN);
			}
		}
		
		
		sc.close();
	}

}
