package fibonacci;

import java.util.Arrays;

public class Fibonacci {
    public static int fibonacci(int n) {
        int[] fibArr = new int[n];
        fibArr[0] = 0;
        if (n > 1) fibArr[1] = 1;
        if (n > 2) {
            for (int i = 3; i <= fibArr.length; i++) {
                fibArr[i-1] = fibArr[i-2] + fibArr[i-3];
            }
        }
        System.out.println(Arrays.toString(fibArr));
        return fibArr[fibArr.length - 1];
    }
}
