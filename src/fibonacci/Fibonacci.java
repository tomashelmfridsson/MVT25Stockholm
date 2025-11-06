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

    public int fibRek(int N) {
        return  fibRek(N - 1) + fibRek(N-2);
    }

    public int fibUtanArr(int N) {
        for (int i = 0; i < N; i++){
            //tal2 = tal0 +tal1;
            //tal0= tal1
            //tal1 = tal2
        }
        return 0;
    }
}
