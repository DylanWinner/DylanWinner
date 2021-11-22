package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TwoLinkTree<T> {
    private BinaryNode root;

    public TwoLinkTree(){//构造默认的无参构造函数
        root = new BinaryNode();
    }

    public TwoLinkTree(T data){
        root = new BinaryNode(data);
    }


    //parent是要添加子节点的父节点，left是否为左节点,data是新子节点的数据
    public BinaryNode add(BinaryNode parent,T data,boolean left){

        if (parent == null || parent.data == null){
            System.out.println("节点为空，无法插入子节点");
        }

        BinaryNode binaryNode = null;
        if (left == true){
            if (parent.left == null){
                binaryNode = new BinaryNode(data);
                parent.left = binaryNode;
            }else {
                System.out.println("有节点已存在");
            }
        }else {
            if (parent.right == null){
                binaryNode = new BinaryNode(data);
                parent.right = binaryNode;
            }else {
                System.out.println("有节点已存在");
            }
        }
        return binaryNode;
    }

    public boolean isEmpty(){   //判断二叉树data是否为空
        return root.data == null;
    }

    //获取二叉树的高度
    public int deep(){
        return deep(root);
    }

    public int deep(BinaryNode binaryNode){
        if (binaryNode == null){
            return 0;
        }

            int leftDeep = deep(binaryNode.left);
            int rightDeep = deep(binaryNode.right);
            int h = leftDeep>=rightDeep?leftDeep+1:rightDeep+1;
            return h;
    }

    //返回根节点
    public BinaryNode root(){
        if (isEmpty()){
            System.out.println("树为空，无法访问根节点");
        }
        return root;
    }

    //判断是不是完全二叉树
    public void check(){
        LinkedList<BinaryNode> list = new LinkedList<BinaryNode>();
        list.add(root);
        boolean leaf = false;//叶子节点
        boolean flag = true;

        while (!list.isEmpty()){
          BinaryNode temp = list.remove();

          if (temp.left!=null){//层次遍历
              list.add(temp.left);
          }
          if (temp.right!=null){
              list.add(temp.right);
          }
          //判断完全二叉树
            if ((leaf&&(temp.left!=null||temp.right!=null)) || (temp.left==null&&temp.right!=null)) {
                // 遍历的结点没有右孩子，且当前的结点有左或右孩子，直接返回false
                // 如果当前结点有右孩子却没有左孩子，直接返回false
               flag = false;
            }
            if (temp.right == null){
                leaf = true;
            }
        }
        if (flag){
            System.out.println("该二叉树是完全二叉树");
        }
       else {
            System.out.println("该二叉树不是完全二叉树");
        }
    }
}
