import java.util.Arrays;
import java.util.Scanner;

public class Weather2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days' temperatures");
        int days = sc.nextInt();
        if (days < 2) return;
        
        int[] temps = new int[days];
        int sum = 0, count = 0;
        
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + "'s high temp: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        
        double average = (double) sum / days;
        for (int temp : temps) if (temp > average) count++;
        
        Arrays.sort(temps);
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " days above average");
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[days - 1] + ", " + temps[days - 2]);
    }
}
