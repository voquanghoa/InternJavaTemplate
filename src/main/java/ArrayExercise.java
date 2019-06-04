public class ArrayExercise {

    public int calculateSum(int[] array) {
        int sum = 0;

        for (int a : array) {
            sum += a;
        }

        return sum;
    }

    public int[] subArray(int[] source, int start, int length) {

        if (start < 0 || start >= source.length) {
            throw new RuntimeException("Invalid param start");
        }

        if (length < 0) {
            throw new RuntimeException("Invalid param length");
        }

        if (start + length > source.length) {
            length = source.length - start;
        }

        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = source[i + start];
        }

        return result;
    }

    public void crazySort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1; j< array.length; j++){

                if(array[i] % 2 == 0 && array[j] % 2 == 1) continue;
                if(array[i] % 2 == 0 && array[j] % 2 == 0 && array[i] >= array[j]) continue;
                if(array[i] % 2 == 1 && array[j] % 2 == 1 && array[i] <= array[j]) continue;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
}
