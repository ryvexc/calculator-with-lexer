import java.util.ArrayList;

public class Node {
    public final ArrayList<String> type = new ArrayList<>();
    public final ArrayList<String> value = new ArrayList<>();

    public Node() {}

    public void add(String type_in, String value_in) {
        this.type.add(type_in);
        this.value.add(value_in);
    }

    public void printNodes() {
        System.out.print("[");
        for(int i=0; i<type.size(); i++) {
            System.out.printf("%s%s%s", type.get(i), type.get(i) == "NUM" ? ":"+value.get(i) : "", i < type.size() - 1 ? ", " : "");
        }
        System.out.println("]");
    }
}
