public class Exampel {
    public static void main(String[] args) {
        //нужно вывести все числа от n до 0
        method(500);

    }
    public static void method(int i){
        System.out.println(i);
        if (i == 0){
            return;
        }
        method(i / 10);
    }
    }
    // Факториал это произведение чисел от 1 до какого нибудь числа
//1! = 1
//2! = 2
//3! = 1 * 2 * 3;
//4! = 1 * 2 * 3 * 4 ;
//55! = 1 * 2 * 3 * 4 *............* 54 * 55;

