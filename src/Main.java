import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static final boolean showinfo = false;

    public static void main(String[] args) {
        while(true) {
            System.out.print(">");
            String bsc_input = scanner.nextLine();
            Node tokens = new Lexer(bsc_input).parse();
            Parser parser = new Parser(tokens);
            String[] tree = parser.parse();
            if(tree == null) continue;

            if(showinfo) {
                System.out.print("tok: ");
                tokens.printNodes();
                System.out.println("lex: " + tree[1]);
                System.out.print("res: ");
                Printer.print(String.valueOf(Interpreter._num_state));
            } else {
                Printer.print(String.valueOf(Interpreter._num_state));
            }

            Interpreter.reset_num_state();
        }
    }
}
