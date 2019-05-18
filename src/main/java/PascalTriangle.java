public class PascalTriangle {

    public int[] generate(int n){
        int[] result = new int[n + 1];

        result[0] = 1;

        for(int i = 1;i <= n; i++){

            for(int j=i; j>=(i+1)/2; j--){
                result[j] += result[j-1];
            }

            for(int j=1; j<(i+1)/2;j++){
                result[j] = result[i-j];
            }
        }

        return result;
    }

}
