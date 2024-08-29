import java.util.Scanner;
import java.util.ArrayList;

public class ArrayOperations {

    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        arrays = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }

        return arrays;
    }
    public static void printData(float[] arrays) {
        System.out.print("Cac phan tu trong mang la: ");
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static float findMax2(float[] arrays) {
        if (arrays.length < 2) {
            System.out.println("Mang phai co it nhat 2 phan tu.");
            return Float.NaN;
        }

        float max1 = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;

        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (max2 == Float.NEGATIVE_INFINITY) {
            System.out.println("Khong co phan tu lon thu 2 (Tat ca cac phan tu deu giong nhau).");
            return Float.NaN;
        }

        return max2;
    }

    public static float[] deleteOddNumber(float[] arrays) {
        ArrayList<Float> resultList = new ArrayList<>();

        for (float num : arrays) {
            if ((int) num % 2 == 0) { 
                resultList.add(num);
            }
        }

        float[] resultArray = new float[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        float[] arrays = null;

        arrays = importData(arrays);

        printData(arrays);

        float max2 = findMax2(arrays);
        if (!Float.isNaN(max2)) {
            System.out.println("Phan tu lon thu 2 trong mang la: " + max2);
        }

        arrays = deleteOddNumber(arrays);
        System.out.println("Mang sau khi xoa cac phan tu le:");
        printData(arrays);
    }
}

