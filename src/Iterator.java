import java.util.ArrayList;

public class Iterator {
    private String input;
    private Node node;
    private int pos;

    public Iterator(String input) {
        this.input = input;
        this.pos = -1;
    }

    public Iterator(Node node) {
        this.node = node;
        this.pos = -1;
    }

    public char next() {
        this.pos++;
        if(this.pos < this.input.length()) return this.input.charAt(this.pos);
        else return 0;
    }

    public Node nextNode() {
        this.pos++;
        if(this.pos < this.node.types.size()) {
            Node tmp_node = new Node();
            tmp_node.type = this.node.types.get(this.pos);
            tmp_node.value = this.node.values.get(this.pos);
            tmp_node.add(this.node.types.get(this.pos), this.node.values.get(this.pos));
            return tmp_node;
        }
        else return null;
    }
}
