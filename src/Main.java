public class Main {
    public static void main (String[] args ){
        AVLTree tree =new  AVLTree();
        tree.load("/src/dictionary.txt");
        tree.insert("hAD");
        tree.traversePreOrder();
        tree.lookUp("/src/queries.txt");

        System.out.println(tree.height());




    }
}
