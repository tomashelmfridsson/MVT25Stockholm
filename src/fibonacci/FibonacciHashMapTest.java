package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciHashMapTest {
    // 0 1 1 2 3 5 8 13 21 34
    // N = (N-2) + (N-1)

    @Test
    void fibonacci1() {
        assertEquals(0, FibonacciHashMap.fibonacci(1));
    }

    @Test

    void fibonacci2() {
        assertEquals(1, FibonacciHashMap.fibonacci(2));
    }

    @Test
    void fibonacci3(){
        assertEquals(1, FibonacciHashMap.fibonacci(3));
    }

    @Test
    void fibonacci4(){
        assertEquals(2, FibonacciHashMap.fibonacci(4));
    }

    @Test
    void fibonacci10(){
        assertEquals(34, FibonacciHashMap.fibonacci(10));
    }

    @Test
    void fibonacci99(){
        assertEquals(34, FibonacciHashMap.fibonacci(99));
    }

    // int 1010101010100101.... 32 bitar ettor och nollor
    // 1 bit är + eller -   återstår 31 bitar,. 2^31 är max
    // long är nog lösningen funkar ej heller

}
