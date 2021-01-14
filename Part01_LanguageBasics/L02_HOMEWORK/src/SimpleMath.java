import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Это простейший калькулятор. Тебе достаточно ввести два любых числа и я тебе выведу все простейшие значения.");
        System.out.println("Запись числа должна выглядить так: 123.456");

        System.out.println("Введи первое число, будь так любезен.");
        var firstNumber = scanner.nextInt();
        System.out.println("А теперь второе.");
        var secondNumber = scanner.nextInt();

        System.out.println("Сумма этих чисел равна " + (firstNumber + secondNumber));
        System.out.println("Разность равна " + (firstNumber - secondNumber));
        System.out.println("Их произвежение" + (firstNumber * secondNumber));
        System.out.println("Целочисленная часть от деления " + (int) (firstNumber / secondNumber));
        System.out.println("Остаток от деления равен " + (int) (firstNumber % secondNumber));
        System.out.println("Частное этих двух чисел это " + (firstNumber / secondNumber));

    }

}
