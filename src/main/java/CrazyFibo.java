import java.util.ArrayList;

public class CrazyFibo {

    public static int next(int a){
        return (a % 10000)*10 + (a%10 + a%100/10 + a%1000/100 + a%10000/1000 + a/10000) % 10;
    }

    public static int calculate(long n, int a0, int a1, int a2, int a3, int a4) {


        int[] initArray = {a0, a1, a2, a3, a4};

        if(n<initArray.length){
            return initArray[(int)n];
        }


        ArrayList<Integer> series = new ArrayList<>();


        int number = a0 * 10000 + a1 * 1000 + a2* 100 + a3*10 + a4;

        while (!series.contains(number)){
            series.add(number);
            number = next(number);
        }

        return series.get((int)((n - 4) % series.size())) % 10;
    }
}
