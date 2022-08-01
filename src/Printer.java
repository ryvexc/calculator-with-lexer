public class Printer {
    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }
    public static final void print(String input) {
        while(input.charAt(input.length() - 1) == '0' || input.charAt(input.length() - 1) == '.') {
            input = removeLastChar(input);
        }
        System.out.println(input);
    }
}
