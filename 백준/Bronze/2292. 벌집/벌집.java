import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ringNum = 1;
        int num = 1;
        while (num < N) {
            num += 6 * ringNum;
            ringNum++;
        }
        
        System.out.println(ringNum);
        
        sc.close();
    }
}
