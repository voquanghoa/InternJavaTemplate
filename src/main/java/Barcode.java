
public class Barcode{
    public boolean verify(String barcode){

        int sum = 0;

        for(int i=barcode.length() - 1; i>=0; i--){

            int number = barcode.charAt(i) - '0';

            if(i % 2 == 0){
                sum += number;
            }else{
                sum += 3 * number;
            }
        }

        return sum % 10 == 0;
    }
}