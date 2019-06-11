public class Array21 {

    private int[][] removeRowAndFirstColumn(int[][] arr, int row) {

        int size = arr.length - 1;
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            System.arraycopy(arr[i >= row ? i + 1 : i], 1, result[i], 0, size);
        }

        return result;
    }

    public long calculateDeterminant(int[][] arr) {

        if (arr.length == 1) {
            return arr[0][0];
        }

        long sum = 0;

        for (int row = 0; row < arr.length; row++) {

            int[][] childMatrix = removeRowAndFirstColumn(arr, row);
            long childDeterminant = calculateDeterminant(childMatrix);

            if (row % 2 == 0) {
                sum += arr[row][0] * childDeterminant;
            } else {
                sum -= arr[row][0] * childDeterminant;
            }
        }

        return sum;
    }
}
