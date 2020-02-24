public class Main {
    public static void main(String[] args) {
        Entry<Integer> root1 = new Entry<>(7);
        root1.left = new Entry<>(4);
        root1.right = new Entry<>(18);
        root1.right.right = new Entry<>(182);
        root1.right.left = new Entry<>(7);
        root1.left.left = new Entry<>(3);
        root1.left.right = new Entry<>(8);

        Entry<Integer> root2 = new Entry<>(5);
        root2.right = new Entry<>(8);
        root2.right.right = new Entry<>(12);
        root2.left = new Entry<>(3);
        root2.right.left = new Entry<>(4);
        root2.left.left = new Entry<>(2);
        root2.left.right = new Entry<>(5);

        BTreePrinter.printNode(root1);
        BTreePrinter.printNode(root2);

        Entry ourTree = ourEntry(root1, root2);
        BTreePrinter.printNode(ourTree);
    }

    static Entry ourEntry(Entry root1, Entry root2) {

        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        root1.value += root2.value;

        ourEntry(root1.right, root2.right);
        ourEntry(root1.left, root2.left);

        return root1;
    }

}
