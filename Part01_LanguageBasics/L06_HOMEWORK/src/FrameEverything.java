import java.util.Scanner;

public class FrameEverything {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введи введи ширину.");
        var width = input.nextInt();
        System.out.println("Теперь длину рамки.");
        var length = input.nextInt();
        System.out.println("А теперь текст,вокруг которой будет построена рамка.");
        var string = input.next();
        var strlength = string.length();

        System.out.println("\r\n");

        if ((length - 2 < strlength) || (width < 3)) {
            System.out.println("Ошибка заданных параметров!");
        } else {
            var temp1 = width / 2 + width % 2 - 1;
            var temp2 = (length - strlength) / 2;

            for (int i = 0; i < width; i++) {

                for (int j = 0; j < length; j++) {

                    if (i == 0 || i == width - 1 || j == 0 || j == length - 1) {
                        System.out.print("*");

                    } else if (i == temp1 && j == temp2) {

                        for (int k = 0; k < strlength; k++) {
                            System.out.print(string.charAt(k));
                            j++;
                        }

                        j--;

                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }

    }

}
