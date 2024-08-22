import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Bạn đã nhập số nguyên: " + number);
        } else {
            System.out.println("Đây không phải là số nguyên.");
        }
    }
}
