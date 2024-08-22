
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        if (sc.hasNext()) {
            String input = sc.nextLine();
            System.out.println("Bạn đã nhập chuỗi: " + input);
        } else {
            System.out.println("Đây không phải là chuỗi hợp lệ.");
        }
    }
}

