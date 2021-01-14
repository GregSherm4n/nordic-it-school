import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        System.out.println("Представь себе число состоящее из подряд записанных натуральных чисел.");
        System.out.println("Запись этого числа выглядит вот так: 123456789101112131415... и так до бесконечности.");
        System.out.println("Тебе достаточно будет ввести порядковый номер любой цифры.");
        System.out.println("И данная программа выдаст тебе значение этой цифры. Помни! Натуральное число! Удачи");

        var input = new Scanner(System.in);
        var nextLong = input.nextLong();
        nextLong++;

        var numOfDigits = 1L;
        var dividor = 1L;

        while (nextLong - 9 * numOfDigits * dividor > 0) {
            nextLong -= 9 * numOfDigits * dividor;
            numOfDigits++;
            dividor *= 10;
        }

        long tempValue = nextLong % numOfDigits;
        if (nextLong % numOfDigits == 0) {
            nextLong = ((nextLong / numOfDigits) + dividor - 1) % 10;
        } else {
            nextLong = (nextLong / numOfDigits) + dividor;
            for (var d = 0L; d < tempValue - 1; d++) {
                nextLong %= dividor;
                dividor /= 10;
            }
            nextLong = nextLong / dividor;
        }

        System.out.println("Под введеныым тобой номером находится цифра " + nextLong);

    }

}
