package BinaryTree;

public class Test {
    public static void main(String[] args) {
        BinaryTree<String> binaryTree = new BinaryTree<String>(4,"根节点0");
        binaryTree.insert(0, "0右", false);
        binaryTree.insert(2, "2右", false);
        binaryTree.insert(2, "2左", true);
        binaryTree.insert(0, "0左", true);
        binaryTree.insert(1, "1左", true);
        binaryTree.insert(1, "1右", false);
        binaryTree.insert(3, "3左", true);
        binaryTree.insert(3,"3右",false);
        binaryTree.insert(4,"4左",true);
        binaryTree.insert(4,"4右",false);
        binaryTree.insert(5,"5左",true);
        System.out.println(binaryTree);


        TwoLinkTree<String> twoLinkTree = new TwoLinkTree<String>("根0");
        BinaryNode n1 = twoLinkTree.add(twoLinkTree.root(), "第二层左", true);
        BinaryNode n2= twoLinkTree.add(twoLinkTree.root(), "第二层右", false);

        BinaryNode n3=  twoLinkTree.add(n2, "第三层左", true);
        BinaryNode n4=  twoLinkTree.add(n2, "第三层右", false);
       // BinaryNode n5=  twoLinkTree.add(n3, "第四层左", true);


        BinaryNode n6 = twoLinkTree.add(n1,"第三层最左",true);
        BinaryNode n7 = twoLinkTree.add(n1,"第三层次左",false);



        System.out.println("树的深度："+twoLinkTree.deep());
        twoLinkTree.check();


    }
}
