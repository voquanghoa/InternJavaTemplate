public class StringSum {

    private String sum(String a, String b, int remember, String result) {

        if(a.length() + b.length() + remember == 0){
            return result;
        }

        if(a.length() > 0) {
            remember += a.charAt(a.length()-1) - '0';
            a = a.substring(0, a.length()-1);
        }

        if(b.length() > 0){
            remember += b.charAt(b.length() - 1) - '0';
            b = b.substring(0, b.length()-1);
        }

        return sum(a, b, remember/10, (remember % 10) + result);
    }

    public String sum(String a, String b) {
        return sum(a, b, 0, "");
    }
}
