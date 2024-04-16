public class Processing {
    public static String process(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        s.chars().mapToObj(c -> (char) c).map(c -> {
            if (!Character.isDigit(c)) {
                return c;
            }
            int digit = c - '0';
            if (digit % 2 == 0) {
                return (int) Math.pow(digit, 2);
            }
            return (int) Math.pow(digit, 3);
        }).forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}
