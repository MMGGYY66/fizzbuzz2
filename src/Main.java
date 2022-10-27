import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // https://www.techiedelight.com/initialize-array-with-range-1-n-java/
        // https://techiedelight.com/compiler/

        int start = 0;
        int end = 100;

        /*
        create an Integer list from 0 to 100 :
            [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
             22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
             41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
             60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78,
             79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97,
             98, 99, 100]
         */
        List<Integer> range = IntStream.rangeClosed(start, end)
                .boxed().toList();

        //  create an Int array from 0 to 100 :
        int[] arr = IntStream.rangeClosed(1, 10).toArray();
        System.out.println(Arrays.toString(arr));

        // first method invoke
        FizzBuzzArray(range);

        System.out.println("enter a number bigger than zero: !");

        // second method invoke
        fizzBuzz ();
    }

    // create a method with  a list of integers parameter to check which numbers divisible with 3 0r 5 or with both
    public static void FizzBuzzArray(List<Integer> arr) {
        for (Integer number : arr) {
            if (((number % 5) == 0) && ((number % 3) == 0)) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }


    // create a method with  user input to check which numbers divisible with 3 0r 5 or with both
    public static void fizzBuzz(){
        int num = 5;

        while (num > 0){
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num % 5 == 0 && num % 3 == 0){
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(num);
            }
        }
    }
}