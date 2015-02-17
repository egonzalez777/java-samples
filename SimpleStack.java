public class SimpleStack {
    /**
     * Array Stack Implementation
     * @param int capacity
     */

    private String[] s;
    private int N = 0;

    /**
     * @param int capacity
     *
     */
    public SimpleStack(int capacity) {
        s = new String[capacity];
    }

    /**
     * @param void
     * @return boolean
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * @param String item
     * @return void
     */
    public void push(String item) {
        s[N++] = item;
    }

    /**
     * @param void
     * @return String
     */
    public String pop() {
        return s[--N];
    }
}
