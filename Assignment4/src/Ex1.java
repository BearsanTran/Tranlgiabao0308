import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        switch (a) {
            case 5:
                System.out.println("Five");
            case 4:
                System.out.println("Four");
            case 3:
                System.out.println("Three");
            case 2:
                System.out.println("Two");
            case 1:
                System.out.println("One");
            default:
                System.out.println("No");
        }
    }
}
   
