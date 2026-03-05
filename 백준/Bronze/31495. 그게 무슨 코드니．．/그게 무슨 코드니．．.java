import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.length() > 2 &&
            input.charAt(0) == '"' &&
            input.charAt(input.length() - 1) == '"') {
            
            System.out.print(input.substring(1, input.length() - 1));
        } else {
            System.out.println("CE");
        }

        sc.close();
    }
}