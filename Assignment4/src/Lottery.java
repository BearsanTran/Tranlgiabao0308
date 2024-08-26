import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int lotteryNumber = rand.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;
        System.out.println("Day la chuong trinh so xo!");
        System.out.println("Hay doan mot so tu 1 den 100.");

        while (userGuess != lotteryNumber) {
            System.out.print("Nhap so ban doan: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < lotteryNumber) {
                System.out.println("So ban nho hon dap an!");
            } else if (userGuess > lotteryNumber) {
                System.out.println("So ban lon hon dap an!");
            } else {
                System.out.println("Xin chuc mung, ban da doan dung " + lotteryNumber + " sau " + attempts + " lan doan.");
            }
        }

    }
}
