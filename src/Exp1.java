class Node{
    int key;
    Node left,right;
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class Exp1 {
    Node root;
    Exp1()
    {
        root = null;
    }
    void preorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.key);
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node)
    {
        if(node == null)
        {
            return;
        }
        inorder(node.left);
        System.out.println(node.key);
        inorder(node.right);
    }

    void postorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.key);
    }
    void preorder()
    {
        preorder(root);
    }
    void inorder()
    {
        inorder(root);
    }
    void postorder()
    {
        postorder(root);
    }
    public static void main(String[] args) {
        Exp1 tree = new Exp1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traverse : ");
        tree.preorder();
        System.out.println("Inorder traverse : ");
        tree.inorder();
        System.out.println("Postorder traverse : ");
        tree.postorder();

    }
}
