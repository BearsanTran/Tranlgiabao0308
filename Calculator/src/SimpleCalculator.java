import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();
        System.out.println("Cong: " + (a+b));
        System.out.println("Tru: " + (a-b));
        System.out.println("Nhan: " + (a*b));
        
        if (b != 0) {
            System.out.println("Chia: " + (a/b));
            System.out.println("Chia lay du: " + (a%b));
        } else {
            System.out.println("Khong the chia cho 0.");
        }
    }
}
