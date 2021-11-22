package BinaryTree;

import java.util.Arrays;

public class BinaryTree<T> {
    public BinaryNode<T> root;


    private Object[] datas;//数组记录结点

    private int deep;//树的深度

    private int n;//数组的长度，也就是二叉树结点总数


    //构造空二叉树
    public BinaryTree(){
        this.root = null;
        this.n = (int) Math.pow(2,deep)-1;
        this.deep = 4;  //深度默认为4
        datas = new Object[n];
    }

    public BinaryTree(int deep,T data){//指定深度，指定根节点的创建
        this.deep = deep;
        this.n =(int) Math.pow(2,deep)-1;
        datas = new Object[n];
        datas[0] = data;

    }

    public boolean isEmpty(){   //判断二叉树是否为空
        return root.data == null;
    }


    //i是要添加子节点的父节点，left是否为左节点
    public void insert(int i,T data,boolean left){

        if (datas[i] == null){
            System.out.println(i+"节点为空，无法插入子节点");
        }
        if (2*i+1>n || 2*i+2>n){
            System.out.println("二叉树底层数组已满");
        }

        if (left==true){
            if (datas[2*i+1] == null){//左节点为空，可以插入节点
                datas[2*i+1] = data;
            }else {
                System.out.println("有节点已存在");
            }
        }else {
            if (datas[2*i+2] == null){//右节点为空，可以插入节点
                datas[2*i+2] = data;
            }else {
                System.out.println("有节点已存在");
            }
        }
    }

    public String toString(){
        return Arrays.toString(datas);
    }

}
