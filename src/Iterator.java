public class Iterator {
    private String input;
    private int pos;

    public Iterator(String input) {
        this.input = input;
        this.pos = -1;
    }

    public char next() {
        this.pos++;
        if(this.pos < this.input.length()) return this.input.charAt(this.pos);
        else return 0;
    }
}
