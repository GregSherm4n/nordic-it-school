import java.util.ArrayDeque;
import java.util.Scanner;

public class CheckBalance {

    static boolean checkBalance(String string) {
        var arrayDeque = new ArrayDeque<Character>();
        for (int i = 0; i < string.length(); i++) {
            Character charCheck = string.charAt(i);
            if (charCheck.equals('(') || charCheck.equals('{') || charCheck.equals('['))
                arrayDeque.push(charCheck);
            else if (charCheck.equals(')')) {
                if (arrayDeque.isEmpty() || arrayDeque.pop() != '(')
                    return false;
            } else if (charCheck.equals('}')) {
                if (arrayDeque.isEmpty() || arrayDeque.pop() != '{')
                    return false;
            } else if (charCheck.equals(']')) {
                if (arrayDeque.isEmpty() || arrayDeque.pop() != '[')
                    return false;
            }
        }
        return arrayDeque.isEmpty();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите,что будем проверять!\r\n");
        var brackets = input.nextLine();
        System.out.println(checkBalance(brackets));

    }

}
