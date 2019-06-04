public class StringDecoder {

    public String decode(String origin) {

        int count = 1;
        StringBuilder sb = new StringBuilder();
        char previous = origin.charAt(0);

        origin = origin + " ";

        for (int i = 1; i < origin.length(); i++) {

            char ch = origin.charAt(i);

            if (Character.isDigit(ch)) {
                count = 10 * count + ch - '0';
            } else {
                for (int j = 0; j < Math.max(1, count); j++) {
                    sb.append(previous);
                }
                count = 0;
                previous = ch;
            }
        }

        return sb.toString();
    }

}
