import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.print(">");
            String bsc_input = scanner.nextLine();
            Node lexer = new Lexer(bsc_input).parse();
            lexer.printNodes();
        }
    }
}
