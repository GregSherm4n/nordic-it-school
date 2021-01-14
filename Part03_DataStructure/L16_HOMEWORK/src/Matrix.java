import java.util.Iterator;

public class Matrix implements Iterable<Integer> {

    private int[][] matrix;

    public Matrix() {
        super();
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        for (var row : matrix) {
            for (int i = 0; i < row.length; i++)
                System.out.print(row[i] + " ");
            System.out.println();
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MatrixIterator();
    }

    public class MatrixIterator implements Iterator<Integer> {
        private final int NUMBER_OF_ROWS = matrix.length;
        private final int NUMBER_OF_COLUMNS = matrix[0].length;

        private int elemCounter = 0;
        private int top = 0;
        private int bottom = NUMBER_OF_ROWS;
        private int left = 0;
        private int right = NUMBER_OF_COLUMNS;
        private int direction = 0;
        private int counter = 0;
        private int iterator = 0;

        @Override
        public boolean hasNext() {
            return elemCounter < NUMBER_OF_ROWS * NUMBER_OF_COLUMNS;
        }

        @Override
        public Integer next() {
            while (elemCounter < NUMBER_OF_ROWS * NUMBER_OF_COLUMNS) {
                var matrixElem = 0;
                if (direction == 0) {
                    if (left < right) {
                        matrixElem = matrix[top][left++];
                        iterator++;
                    } else {
                        direction++;
                        left -= iterator;
                        iterator = 0;
                    }
                }
                if (direction == 1) {
                    if (top < bottom) {
                        matrixElem = matrix[top++][right - 1];
                        iterator++;
                    } else {
                        direction++;
                        top -= iterator;
                        iterator = 0;
                        counter++;
                        right = NUMBER_OF_COLUMNS - counter - 1;
                    }
                }
                if (direction == 2) {
                    if (top < bottom) {
                        if (right >= left) {
                            matrixElem = matrix[bottom - 1][right--];
                            iterator++;
                        } else {
                            direction++;
                            right += iterator;
                            iterator = 0;
                            bottom = NUMBER_OF_ROWS - counter - 1;
                        }
                    }
                }
                if (direction == 3) {
                    if (left < right) {
                        if (bottom >= top) {
                            matrixElem = matrix[bottom--][left];
                            iterator++;
                        } else {
                            direction = 0;
                            bottom += iterator;
                            iterator = 0;
                            left = counter;
                        }
                    }
                }
                elemCounter++;
                return matrixElem;
            }
            return null;
        }


//        @Override
//        public Integer next() {
//            var matrixElem = 0;
//            if (direction == 0) {
//                if (left <= right) {
//                    matrixElem = matrix[top][left++];
//                }
//                if (left > right) {
//                    direction++;
//                    left = counter;
//                    counter++;
//                }
//            }
//
//            if (direction == 1) {
//                if (top <= bottom) {
//                    matrixElem = matrix[top++][right];
//                }
//                if (top > bottom) {
//                    direction++;
//                    top = counter;
//                }
//            }
//
//            if (direction == 2) {
//                if (right >= left) {
//                    matrixElem = matrix[bottom][right--];
//                }
//                if (right < left) {
//                    direction++;
////                    bottom--;
//                    right = NUMBER_OF_COLUMNS - 1 - counter;
//                    counter++;
//
//                }
//            }
//
//            if (direction == 3) {
//                if (bottom >= top) {
//                    matrixElem = matrix[bottom--][left];
//                }
//                if (bottom < top) {
//                    direction = 0;
//                    left++;
//                    bottom = NUMBER_OF_ROWS - counter;
//                }
//            }
//
//            elemCounter++;
//            return matrixElem;
//        }
    }
}
