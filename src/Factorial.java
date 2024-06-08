public class Factorial {
    public static void main(String[] args) {
       int first = factorialCommon(6);
       System.out.println(first);
      //  int first = factorialRecursion(6);
      //  System.out.println(first);


    }
    //факториал
    //4! = 1 * 2 * 3 * 4;
    //5! = 1 * 2 * 3 * 4 * 5;
    // Можно сказать что
    //%1 = 4! * 5;
    //Математическая формула факториала это
    //f(n) = n * f(n - 1);
    //факториал 0 = 1;


    public static int factorialCommon(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        return result;
    }
    public static int factorialRecursion(int n) {
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorialRecursion(n -1);

    }
    //Фибоначи
    // 1.1.2.3.5.8.13.21.34.55.89.144.233.377


}
