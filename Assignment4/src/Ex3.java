
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen (0 < n <= 9): ");
        int n = sc.nextInt();

        if (n > 1 && (n == 2 || n == 3 || n == 5 || n == 7)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }

    }
}
