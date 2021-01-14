import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Создать класс целых чисел MyInteger с порядком на основе количества простых делителей.\n" +
                "Покажите на примере 4 - 5 чисел.\r\nЧисла записаны в таком порядке: 180, 141, 977, 52, 690");

        var task1 = new TreeSet<MyInteger>();
        task1.add(new MyInteger(180));
        task1.add(new MyInteger(141));
        task1.add(new MyInteger(977));
        task1.add(new MyInteger(52));
        task1.add(new MyInteger(690));
        System.out.print("Теперь порядок такой:\r\n");
        for (MyInteger n : task1) {
            System.out.print(n.getNumber() + " ");
        }

        System.out.println("\r\n-------------");

        System.out.println("Создать класс целых чисел MyInteger с итератором по цифрам десятичного представления чисел.\r\n"
                + "Покажите на примере 4-5 чисел. Используйте конструкцию for-each.\r\n"
                + "Числа записаны в таком порядке: 123, 16384, 64, 1024, 758645249");

        var task2 = new ArrayList<ReversedMyInteger>();
        task2.add(new ReversedMyInteger(123));
        task2.add(new ReversedMyInteger(16384));
        task2.add(new ReversedMyInteger(64));
        task2.add(new ReversedMyInteger(1024));
        task2.add(new ReversedMyInteger(785645249));

        System.out.println("Результат:");
        for (ReversedMyInteger elem : task2) {
            for (String num : elem) {
                System.out.println(elem.getNumber() + " -> " + num);
            }
        }
        System.out.println("-------------\r\nСоздать класс целых чисел MyInteger с порядком на основе количества " +
                "различных (!) цифр в десятичном представлении.\r\nЧисла записаны в таком порядке: 98760, 445566," +
                " 111222, 7777, 9966123");
        var hardTask1 = new TreeSet<MyIntegerHard>();
        hardTask1.add(new MyIntegerHard(98760));
        hardTask1.add(new MyIntegerHard(445566));
        hardTask1.add(new MyIntegerHard(111222));
        hardTask1.add(new MyIntegerHard(7777));
        hardTask1.add(new MyIntegerHard(1));
        hardTask1.add(new MyIntegerHard(9966123));

        System.out.println("Отсортированный список по кол-ву уникальных цифр:");
        for (MyIntegerHard nmb : hardTask1) {
            System.out.print(nmb + " ");
        }
//        System.out.println("\r\n---------------\r\nСоздать класс матриц Matrix с итератором, проходящим матрицу в " +
//                "спиральном порядке.");
//        var exampleMatrix1 = new int[][]{{1, 2, 3, 4}};
//        var exampleMatrix2 = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
//        var exampleMatrix3 = new int[][]{{1, 2, 3}, {10, 11, 4}, {9, 12, 5}, {8, 7, 6}};
//        var exampleMatrix4 = new int[][]{{1, 2, 3, 4, 5, 6}, {16, 17, 18, 19, 20, 7}, {15, 24, 23, 22, 21, 8},
//                {14, 13, 12, 11, 10, 9}};
//        var exampleMatrix5 = new int[][]{{1}, {2}, {3}, {4}};
//
//
//        System.out.println("Матрица№1 выглядит так:");
//        var mat1 = new Matrix(exampleMatrix1);
//        mat1.printMatrix();
//
//        System.out.println("Матрица№2 выглядит так:");
//        var mat3 = new Matrix(exampleMatrix4);
//        mat2.printMatrix();
//
//        for (var t : mat3) {
//            System.out.print(t + " ");
//        }
//
//        System.out.println("Матрица№3 выглядит так:");
//        var mat3 = new Matrix(exampleMatrix3);
//        mat3.printMatrix();
//
//        System.out.println("Матрица№4 выглядит так:");
//        var mat4 = new Matrix(exampleMatrix4);
//        mat4.printMatrix();
//
//        System.out.println("Матрица№5 выглядит так:");
//        var mat5 = new Matrix(exampleMatrix5);
//        mat5.printMatrix();

    }

}
