public class UserForPQ implements Comparable<UserForPQ> {
    public String name;
    public int val;


    @Override
    public int compareTo(UserForPQ o) {
        return o.val - this.val;
    }
}
