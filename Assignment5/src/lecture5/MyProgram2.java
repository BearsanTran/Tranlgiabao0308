package lecture5;

import java.util.Arrays;

public class MyProgram2 {

    public static void main(String[] args) {
        int[] iq = {126, 84, 149, 167, 95};
        int[] stuttered = stutter(iq);
        System.out.println(Arrays.toString(stuttered));
    }

    public static int[] stutter(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int[] result = new int[2 * numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[2 * i] = numbers[i];
            result[2 * i + 1] = numbers[i];
        }
        return result;
    }
}
