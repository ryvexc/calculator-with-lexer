import java.util.ArrayList;

public class Node {
    public final ArrayList<String> types = new ArrayList<>();
    public final ArrayList<String> values = new ArrayList<>();
    public String type;
    public String value;

    public Node() {}

    public void add(String type_in, String value_in) {
        this.types.add(type_in);
        this.values.add(value_in);
    }

    public void repr() {
        System.out.print("[");
        for(int i=0; i<types.size(); i++) {
            System.out.printf("%s%s%s", types.get(i), types.get(i) == "NUM" ? ":"+values.get(i) : "", i < types.size() - 1 ? ", " : "");
        }
        System.out.println("]");
    }

    public void printNodes() {
        System.out.print("[");
        for(int i=0; i<types.size(); i++) {
            System.out.printf("%s%s%s", types.get(i), types.get(i) == "NUM" ? ":"+values.get(i) : "", i < types.size() - 1 ? ", " : "");
        }
        System.out.println("]");
    }
}

class Numbernode {
    private float node;
    public Numbernode(float node) { this.node = node; }
    public String repr() { return String.valueOf(this.node);}
}

class Addnode {
    private String left_node, right_node;
    public Addnode(String left_node, String right_node) { this.left_node = left_node; this.right_node = right_node; }
    public String repr() { return "(" + this.left_node + "+" + this.right_node + ")"; }
}

class Subtractnode {
    private String left_node, right_node;
    public Subtractnode(String left_node, String right_node) { this.left_node = left_node; this.right_node = right_node; }
    public String repr() { return "(" + this.left_node + "-" + this.right_node + ")"; }
}

class Multiplynode {
    private String left_node, right_node;
    public Multiplynode(String left_node, String right_node) { this.left_node = left_node; this.right_node = right_node; }
    public String repr() { return "(" + this.left_node + "*" + this.right_node + ")"; }
}

class Dividenode {
    private String left_node, right_node;
    public Dividenode(String left_node, String right_node) { this.left_node = left_node; this.right_node = right_node; }
    public String repr() { return "(" + this.left_node + "/" + this.right_node + ")"; }
}

class Plusnode {
    private float node;
    public Plusnode(float node) { this.node = node; }
    public String repr() { return "(+" + String.valueOf(this.node) + ")";}
}

class Minusnode {
    private float node;
    public Minusnode(float node) { this.node = node; }
    public String repr() { return "(-" + String.valueOf(this.node) + ")";}
}