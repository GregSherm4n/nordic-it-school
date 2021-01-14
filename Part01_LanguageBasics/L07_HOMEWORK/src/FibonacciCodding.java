import java.util.Scanner;

public class FibonacciCodding {

    static String fibcode(long num) {
        long buffer = 0;
        long fibnum1 = 0;
        long fibnum2 = 1;
        String result = "1";

        if (num == 0) {
            result = "0";
        } else {

            while (num - fibnum1 >= fibnum2) {
                buffer = fibnum1 + fibnum2;
                fibnum1 = fibnum2;
                fibnum2 = buffer;
            }

            num -= fibnum2;

            while (fibnum2 > 1) {
                buffer = fibnum2 - fibnum1;
                fibnum2 = fibnum1;
                fibnum1 = buffer;

                if (num - fibnum2 >= 0) {
                    num -= fibnum2;
                    result += "1";
                } else {
                    result += "0";
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи любое число, и я переведу его в ФСС");
        var usernum = input.nextLong();

        while (usernum < 0) {
            System.out.println("Введи, пожалуйста, неотрицательное число");
            usernum = input.nextLong();
        }

        System.out.println("\r\n");
        System.out.println("При переводе получаем вот такое число: \r\n" + fibcode(usernum));

    }
    
}
