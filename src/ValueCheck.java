public class ValueCheck {
    public static boolean isNumber(char input) {
        final String _number = "0123456789";
        for(int i=0; i<_number.length(); i++)
            if(input == _number.charAt(i)) return true;
        return false;
    }
}
