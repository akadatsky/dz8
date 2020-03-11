
public class Entry<T extends Comparable<?>> {
    int value;
    Entry<T> left;
    Entry<T> right;

    // test2
    public Entry(int value) {
        this.value = value;
    }

}