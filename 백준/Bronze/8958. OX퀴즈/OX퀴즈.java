import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCase = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numCase; i++) {
			int combo = 0, grade = 0;
			String inputCase = sc.nextLine();				//케이스 입력
			for(int k = 0; k < inputCase.length(); k++) {	//케이스의 길이만큼 반복
				switch(inputCase.charAt(k)) {
				case 'O':
					for(int j = 0; j <= combo; j++) {
						grade++;
					}
					combo++;
					break;
				case 'X':
					combo = 0;
					break;
				}
			}
			System.out.println(grade);
		}
		
		
		
		
		
		sc.close();
		
		
		
	}

}