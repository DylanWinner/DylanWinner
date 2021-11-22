package BinaryTree;

public class BinaryNode<T> {
    public T data;//数据域
    public BinaryNode<T> left,right;//地址域，指向左右孩子结点

    public BinaryNode(){

    }


    public BinaryNode(T data) {//构造元素为data的叶子结点
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public BinaryNode(T data,BinaryNode left,BinaryNode right){//构造节点
        this.data = data;
        this.left = left;
        this.right = right;

    }

    public String toString() {
        return null;
    }

    public boolean isLeaf(){
        return false;
    }
}
