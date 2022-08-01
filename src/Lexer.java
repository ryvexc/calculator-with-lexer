public class Lexer {
    public Iterator basic_input;
    public char current_char;
    public Node node = new Node();

    public Lexer(String str_input) {
        this.basic_input = new Iterator(str_input);
        this.mov_pos();
    }

    public void mov_pos() {
        char chk_iter = basic_input.next();
        if(chk_iter != 0) this.current_char = chk_iter;
        else this.current_char = (char)0;
    }

    public Node parse() {
        while(this.current_char != (char)0) {
            if(this.current_char == ' ' || this.current_char == '\t') this.mov_pos();
            else if(ValueCheck.isNumber(this.current_char) || this.current_char == '.') this.generateNumber();
            else if(this.current_char == '+') {
                node.add("PLUS", "+");
                this.mov_pos();
            }
            else if(this.current_char == '-') {
                node.add("MINUS", "-");
                this.mov_pos();
            }
            else if(this.current_char == '*') {
                node.add("MUL", "*");
                this.mov_pos();
            }
            else if(this.current_char == '/') {
                node.add("DIV", "/");
                this.mov_pos();
            }
            else {
                System.out.println("Input Error!");
                this.mov_pos();
            }
        }

        return node;
    }
    
    public void generateNumber() {
        String _stream = String.valueOf(this.current_char);
        this.mov_pos();
        while(true) {
            if(ValueCheck.isNumber(this.current_char) || this.current_char == '.') _stream += String.valueOf(this.current_char);
            else break;
            this.mov_pos();
        }
        if(_stream.charAt(0) == '.') node.add("NUM", "0"+_stream);
        else if(!_stream.contains(".")) node.add("NUM", _stream+".0");
        else if(_stream.charAt(_stream.length() - 1) == '.') node.add("NUM", _stream+"0");
        else node.add("NUM", _stream);
    }
}
