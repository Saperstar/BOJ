import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = new String();
		double[] hak = new double[20];
		double[] gethak = new double[20];
		double totalHak = 0;
		double sumPoint = 0;
		for(int i = 0; i < 20; i++) {
			line = sc.nextLine();
			String[] tokens = line.split(" ");
			
			hak[i] = Double.parseDouble(tokens[1]);		//몇학점 짜리인지 hak배열에 float로 저장
			switch(tokens[2]) {
			case "A+":
				gethak[i] = 4.5;
				break;
			case "A0":
				gethak[i] = 4;
				break;
			case "B+":
				gethak[i] = 3.5;
				break;
			case "B0":
				gethak[i] = 3;
				break;
			case "C+":
				gethak[i] = 2.5;
				break;
			case "C0":
				gethak[i] = 2;
				break;
			case "D+":
				gethak[i] = 1.5;
				break;
			case "D0":
				gethak[i] = 1;
				break;
			case "P":
				gethak[i] = 100;
				hak[i] = 0;
				break;
			case "F":
				gethak[i] = 0;
				break;
			}
		}
		for(int k = 0; k < 20; k++) {
			totalHak += hak[k]; 
		}
		
		for(int i = 0; i < 20; i++) {
			if(gethak[i] != 100) {
				sumPoint += gethak[i] * hak[i]; 
			}
		}
		double grade = sumPoint / totalHak;
		System.out.println(grade);
		
		sc.close();
	}

}

