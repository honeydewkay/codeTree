import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char c = s.charAt(0);
        System.out.printf("%c \n%.2f\n%.2f\n", c, a, b);

    }
}