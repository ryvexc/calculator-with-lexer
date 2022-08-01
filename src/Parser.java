public class Parser {
    private Iterator node_iter;
    private Node current_node;
    public Parser(Node node) {
        this.node_iter = new Iterator(node);
        this.mov_pos();
    }

    public void error() {
        System.out.println("Invalid Syntax! --");
    }
    public void errorln() {
        System.out.println("errorln");
    }

    public void mov_pos() {
        Node chk_iter = node_iter.nextNode();
        if(chk_iter != null) this.current_node = chk_iter;
        else this.current_node = null;
    }

    public String parse() {
        if(this.current_node == null) return null;
        String result = this.expr();

        if(this.current_node != null) this.errorln();

        return result;
    }

    public String expr() {
        String result = this.term();

        while(this.current_node != null && (this.current_node.type.equals("PLUS") || this.current_node.value.equals("MINUS"))) {
            if(this.current_node.type.equals("PLUS")) {
                this.mov_pos();
                result = new Addnode(result, this.term()).repr();
            }
            else if(this.current_node.type.equals("MINUS")) {
                this.mov_pos();
                result = new Subtractnode(result, this.term()).repr();
            }
        }
        
        return result;
    }

    public String term() {
        String result = this.factor();

        while(this.current_node != null && (this.current_node.type.equals("MUL") || this.current_node.type.equals("DIV"))) {
            if(this.current_node.type.equals("MUL")) {
                this.mov_pos();
                result = new Multiplynode(result, this.factor()).repr();
            }
            else if(this.current_node.type.equals("DIV")) {
                this.mov_pos();
                result = new Dividenode(result, this.factor()).repr();
            }
        }

        return result;
    }

    public String factor() {
        Node token = this.current_node;

        if(token.type.equals("NUM")) {
            this.mov_pos();
            return new Numbernode(Float.parseFloat(token.value)).repr();
        } else {
            this.error();
            return "";
        }
    }
}