package lecture5;

import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days' temperatures");
        int days = sc.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++)
        {
            System.out.println("Day " + (i + 1) + "'s high temp: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f", average);
        System.out.println("");
        System.out.println(count + " days above average");
    }
}
