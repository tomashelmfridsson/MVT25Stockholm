package fibonacci;

import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        try {
            int mittN = input();
            System.out.println(Fibonacci.fibonacci(mittN));
        }catch (Exception e){
            System.out.println("Det blev fel ");
        }
    }

    public static int input(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
