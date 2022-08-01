public class Interpreter {
    public static double _num_state = 0;
    public static void insert_num(double input) {
        _num_state = input;
    }
    public static void reset_num_state() {
        _num_state = 0;
    }
}
