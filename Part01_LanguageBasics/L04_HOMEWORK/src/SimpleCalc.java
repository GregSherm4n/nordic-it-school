import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {

        System.out.println("Здравствуй. Этот програмный код может проводить простейшие математические операции.");
        System.out.println("Введи математическую операцию, которую нужно выполнить.");
        System.out.println("Для сложения введи '+'");
        System.out.println("Для вычитания введи '-'");
        System.out.println("Для умножения введи '*'");
        System.out.println("Для деления введи '/'");
        System.out.println("Для целочисленного деления введи 'div'");
        System.out.println("Для вычисления остатка от деления введи 'mod'");
        System.out.println("Для возведения в степень введи '^'");

        Scanner input = new Scanner(System.in);
        String action = input.next();

        while (!(action.equals("+") || action.equals("-") || action.equals("*") || action.equals("*")
                || action.equals("/") || action.equals("div") || action.equals("mod") || action.equals("^"))) {
            System.out.println("Будьте добры ввести действие корректно.");
            action = input.next();
        }

        System.out.println("Введи, пожалуйста, свое первое целое число.");
        var num1 = input.nextInt();
        System.out.println("А теперь второе целое число, будь так любезен.");
        var num2 = input.nextInt();

        if (action.equals("/") || action.equals("div") || action.equals("mod")) {
            while (num2 == 0) {
                System.out.print("Решения этой программы ограничены математическими правилами алгебры.");
                System.out.print("Заново введи второе число, будь любезен. \r\n");
                num2 = input.nextInt();
            }
        }

        System.out.println("\r\n---------------------------------------\r\n");

        switch (action) {
            case ("+"): {
                System.out.println("Сумма чисел " + num1 + " и " + num2 + " равна " + (num1 + num2));
                break;
            }
            case ("-"): {
                System.out.println("Разность чисел " + num1 + " и " + num2 + " равна " + (num1 - num2));
                break;
            }
            case ("*"): {
                System.out.println("Произведение чисел " + num1 + " и " + num2 + " равно " + (num1 * num2));
                break;
            }
            case ("/"): {
                System.out.println("Частное чисел " + num1 + " и " + num2 + " равно " + (double) num1 / num2);
                System.out.println(
                        "В виде дроби,частное выглядит так: " + (num1 / num2) + " + " + (num1 % num2) + "/" + num2);
                break;
            }
            case ("div"): {
                System.out.println("Целая часть от деления " + num1 + " на " + num2 + " равна " + num1 / num2);
                break;
            }
            case ("mod"): {
                System.out.println("Остаток от деления " + num1 + " на " + num2 + " равен " + num1 % num2);
                break;
            }
            case ("^"): {
                var count = num2;
                double exponentiation = 1;
                if (num2 < 0)
                    count = -count;

                while (count > 0){
                    exponentiation *=num1;
                    count--;
                }
                System.out.println("Возведенние числа " + num1 + " в степень " + num2 + " равно " + (num2 >= 0 ? exponentiation : 1 / exponentiation));
                break;
            }
            default: {
                //just nothing))
                break;
            }
        }

    }

}