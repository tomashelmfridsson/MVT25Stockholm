package fibonacci;

import java.util.HashMap;

public class FibonacciHashMap {
    public static int fibonacci(int n) {
        HashMap<Integer, Integer> fibHashMap =  new HashMap<>();
        fibHashMap.put(1,0);
        return fibHashMap.get(n);
    }
}
