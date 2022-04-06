class NodeBst{
    int data;
    NodeBst left;
    NodeBst right;
    NodeBst(int data)
    {
        this.data = data;
    }
}

public class BinarySearch_Tree {
    public static void Preorder(NodeBst root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Postorder(NodeBst root)
    {
        if(root==null)
        {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void Inorder(NodeBst root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public static String BinarSearch(NodeBst root,int ele)
    {
        if (root == null)
        {
            return "Element not found";
        }
        while (root != null)
        {
            if(root.data == ele)
            {
                return "Element Found";
            }
            else if(root.data < ele)
            {
                root = root.right;
            }
            else if(root.data > ele)
            {
                root = root.left;
            }
        }
        return "Element not found";
    }
    public static int min(NodeBst root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root.data;
    }
    public static int max(NodeBst root)
    {
        while (root.right != null)
        {
            root = root.right;
        }
        return root.data;
    }
    public static void main(String[] args) {
        NodeBst root;
        NodeBst first = new NodeBst(20);
        NodeBst second = new NodeBst(10);
        NodeBst third = new NodeBst(40);
        NodeBst fourth = new NodeBst(2);
        NodeBst five = new NodeBst(3);
        NodeBst six = new NodeBst(15);
        NodeBst seven = new NodeBst(70);
        NodeBst eight = new NodeBst(45);
        NodeBst nine = new NodeBst(80);
        NodeBst ten = new NodeBst(60);
        NodeBst eleven = new NodeBst(61);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = five;
        five.right=six;
        third.right = seven;
        seven.left = eight;
        seven.right = nine;
        eight.right = ten;
        ten.right = eleven;
        Preorder(root);
        System.out.println();
        Postorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
        System.out.println(BinarSearch(root,90));
        System.out.println();
        System.out.println(min(root));
        System.out.println(max(root));
    }
}
