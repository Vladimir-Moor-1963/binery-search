public class Fibonacci {
    public static void main(String[] args) {
        //Фибоначи
        // 1.1.2.3.5.8.13.21.34.55.89.144.233.377
        long start = System.nanoTime();
        int second = fibonacciRecursion(8);
        long finish = System.nanoTime();
        System.out.println(finish - start);
        System.out.println(second);

       start = System.nanoTime();
       int first = fiboacciCommon(8);
       finish = System.nanoTime();
        System.out.println(finish - start);
        System.out.println(first);
    }
    public static int fiboacciCommon(int n){
        if (n == 0) {
            return 1;
        }

        int[] fib = new int[n + 1];

        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < fib.length ; i++) {
            fib[i] = fib[i - 1] + fib[i -2];

        }

        return fib[fib.length -1];

    }
   public static int fibonacciRecursion(int n) {
       if (n == 0 || n == 1) {
           return 1;
       }
       return fibonacciRecursion(n - 1) + fibonacciRecursion(n -2);
   }// Recursion + Recursion Это очень ресурсно затратный метод.
}
