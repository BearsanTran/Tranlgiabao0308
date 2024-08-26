import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;
        do {
            System.out.print("Type your password: ");
            phrase = sc.nextLine();
        } while (!phrase.equals("Duy Tan"));
    }
}
