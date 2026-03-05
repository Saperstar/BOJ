import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		int word = 0;
		
		for(int i = 0; i < line.length(); i++) {
			char ch = 0, ch2 = 0, ch3 = 0;
			ch = line.charAt(i);
			if(i+1 < line.length()) {
				ch2 = line.charAt(i + 1);
			}
			if(i+2 < line.length()) {
				ch3 = line.charAt(i + 2);
			}
			
			//c일 경우
			if(ch == 'c') {
				if(ch2 == '=' || ch2 == '-') {
					i++;
					word++;
					continue;
				}
				else {
					word++;
					continue;
				}
			}
			
			//d일 경우
			else if(ch == 'd') {
				if(ch2 == 'z' && ch3 == '=') {
					i += 2;
					word++;
					continue;
				}
				else if(ch2 == '-') {
					i++;
					word++;
					continue;
				}
				else {
					word++;
					continue;
				}
			}
			
			//l일 경우
			else if(ch == 'l' && ch2 == 'j') {
				i++;
				word++;
				continue;
			}
			
			//n일 경우
			else if(ch == 'n' && ch2 == 'j') {
				i++;
				word++;
				continue;
			}
			
			//s일 경우
			else if(ch == 's' && ch2 == '=') {
				i++;
				word++;
				continue;
			}
			
			//z일 경우
			else if(ch == 'z' && ch2 == '=') {
				i++;
				word++;
				continue;
			}
			else {
				word++;
			}
		}
		
		System.out.println(word);
		
		sc.close();

	}

}
