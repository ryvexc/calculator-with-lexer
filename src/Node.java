import java.util.ArrayList;

public class Node {
    public final ArrayList<String> types = new ArrayList<>();
    public final ArrayList<String> values = new ArrayList<>();
    public String type, value;

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
    private double node_value;
    public Numbernode(double node_value) { this.node_value = node_value; }
    public String[] repr() {
        Interpreter.insert_num(this.node_value);
        return new String[]{ String.valueOf(this.node_value), String.valueOf(this.node_value) };
    }
}

class Addnode {
    private String left_node, right_node;
    public Addnode(String left_node, String right_node) { this.left_node = left_node; this.right_node = right_node; }
    public String[] repr() {
        Interpreter.insert_num(Double.parseDouble(left_node) + Double.parseDouble(right_node));
        return new String[]{
                // lex info
                String.valueOf(Double.parseDouble(left_node) + Double.parseDouble(right_node)),
                // lex res
                "(" + this.left_node + "+" + this.right_node + ")"
        };
    }
}

class Subtractnode {
    private String left_node, right_node;
    public Subtractnode(String left_node, String right_node) { this.left_node = left_node; this.right_node = right_node; }
    public String[] repr() {
        Interpreter.insert_num(Double.parseDouble(left_node) - Double.parseDouble(right_node));
        return new String[]{
                // lex info
                String.valueOf(Double.parseDouble(left_node) - Double.parseDouble(right_node)),
                // lex res
                "(" + this.left_node + "-" + this.right_node + ")"
        };
    }
}

class Multiplynode {
    private String left_node, right_node;
    public Multiplynode(String left_node, String right_node) { this.left_node = left_node; this.right_node = right_node; }
    public String[] repr() {
        Interpreter.insert_num(Double.parseDouble(left_node) * Double.parseDouble(right_node));
        return new String[]{
                // lex info
                String.valueOf(Double.parseDouble(left_node) * Double.parseDouble(right_node)),
                // lex res
                "(" + this.left_node + "*" + this.right_node + ")"
        };
    }
}

class Dividenode {
    private String left_node, right_node;
    public Dividenode(String left_node, String right_node) { this.left_node = left_node; this.right_node = right_node; }
    public String[] repr() {
        Interpreter.insert_num(Double.parseDouble(left_node) / Double.parseDouble(right_node));
        return new String[]{
                // lex info
                String.valueOf(Double.parseDouble(left_node) / Double.parseDouble(right_node)),
                // lex res
                "(" + this.left_node + "/" + this.right_node + ")"
        };

    }
}

class Plusnode {
    private double node;
    public Plusnode(double node) { this.node = node; }
    public String[] repr() {
        Interpreter.insert_num(this.node);
        return new String[]{ "+"+String.valueOf(this.node), "(+" + String.valueOf(this.node) + ")" };
    }
}

class Minusnode {
    private double node;
    public Minusnode(double node) { this.node = node; }
    public String[] repr() {
        Interpreter.insert_num(this.node);
        return new String[]{ "-"+String.valueOf(this.node), "(-" + String.valueOf(this.node) + ")" };
    }
}