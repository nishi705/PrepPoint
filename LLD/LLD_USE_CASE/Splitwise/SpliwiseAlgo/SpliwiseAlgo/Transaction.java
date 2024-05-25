public class Transaction {
    public String from;
    public String to;
    public int amount;

    @Override
    public String toString() {
        return "[" + from + " -> " + to + "] (" + amount + ")\n";
    }
}
