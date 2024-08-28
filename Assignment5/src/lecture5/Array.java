package lecture5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(numbers));
        
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
            System.out.println("Mảng sau khi thay đổi:");
            System.out.println(Arrays.toString(numbers)); 
        }
    }
}
