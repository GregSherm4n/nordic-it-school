public class FuncArrays {

    static boolean isPalindrom(String word) {
        if (word.length() == 0 || word.length() == 1)
            return true;
        else if (word.charAt(0) != word.charAt(word.length() - 1))
            return false;
        else
            return isPalindrom(word.substring(1, word.length() - 1));
    }

    static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tempArray = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tempArray;
        }
    }

    static int[] noCopy(int[] array) {
        if (array.length == 0)
            return new int[0];
        if (array.length == 1)
            return array;
        else {
            var numOfUniqElem = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[i] != array[i - 1])
                    numOfUniqElem++;
            }

            if (numOfUniqElem == array.length)
                return array;
            else {
                var resArray = new int[numOfUniqElem];
                resArray[0] = array[0];
                var position = 1;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] != array[i - 1]) {
                        resArray[position] = array[i];
                        position++;
                    }
                }
                return resArray;
            }
        }
    }

    public static void main(String[] args) {
        //task1
        System.out.println(isPalindrom("топот")); //waiting true
        System.out.println(isPalindrom("тпот")); //waiting false

        //task2
        var array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        reverseArray(array);
        for (var elem : array) {
            System.out.print(elem);
        } //waiting 87654321
        System.out.println();

        //task3
        var array1 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 4};
        array1 = noCopy(array1);
        for (var elem: array1) {
            System.out.print(elem);
        } //waiting 1234
    }
}
