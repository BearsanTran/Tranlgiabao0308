package lecture5;

import java.util.Random;

public class Lecture5 {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100 - 23 + 1) + 23;
        System.out.println("So ngau nhien la: " + n);
        if (n % 2 == 0) {
            System.out.println("Day la so chan! ");
        } else {
            System.out.println("Day la so le! ");
        }

    }
}
