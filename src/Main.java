public class Main {
    public static void main(String[] args) {
       // int[] array = {4, 5, 10, };
        int[] array = {4, 5, 10, 12, 133, 44 };
        int result = binarySearch(array,6,0,array.length -1);
        System.out.println(result);

    }

    public static int binarySearch(int[] array, int number,int start, int finish) {
      //  int start = 0;
      //  int finish = array.length - 1;
        int indexs = -1;




            int median = (start + finish) / 2;
            if (array[median] == number) {
                indexs = median;
            }
            if (start == finish && array[median] != number){
                return -1;

        }


            if (array[median] > number) {
                indexs = binarySearch(array,number,start,median -1);
                finish = median - 1;
            }
            if (array[median] < number) {
                indexs = binarySearch(array,number,median +1,finish);
                start = median + 1;
            }
            return indexs;





    }
}