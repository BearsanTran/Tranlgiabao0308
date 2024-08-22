import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = 0;
        if (sc.hasNextInt()) {
            tuoi = sc.nextInt();
            sc.nextLine(); 
        } else {
            System.out.println("Tuổi không hợp lệ.");
            return;
        }
        System.out.print("Nhập năm sinh: ");
        int namSinh = 0;
        if (sc.hasNextInt()) {
            namSinh = sc.nextInt();
            sc.nextLine(); 
        } else {
            System.out.println("Năm sinh không hợp lệ.");
            return;
        }
        System.out.print("Nhập giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhập chuyên ngành: ");
        String chuyenNganh = sc.nextLine();
        System.out.print("Nhập GPA: ");
        double gpa = 0.0;
        if (sc.hasNextDouble()) {
            gpa = sc.nextDouble();
            sc.nextLine(); 
        } else {
            System.out.println("GPA không hợp lệ.");
            return;
        }
        System.out.print("Nhập quê quán: ");
        String queQuan = sc.nextLine();
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Chuyên ngành: " + chuyenNganh);
        System.out.println("GPA: " + gpa);
        System.out.println("Quê quán: " + queQuan);
    }
}
