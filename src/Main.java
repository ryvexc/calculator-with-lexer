import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.print(">");
            String bsc_input = scanner.nextLine();
            Node tokens = new Lexer(bsc_input).parse();
            Parser parser = new Parser(tokens);
            String tree = parser.parse();
            if(tree == null) continue;
            Printer.print(String.valueOf(Interpreter._num_state));
            Interpreter.reset_num_state();
        }
    }
}
