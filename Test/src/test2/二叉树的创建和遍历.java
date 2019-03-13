package test2;

import java.util.Scanner;

public class 二叉树的创建和遍历 {

    public static void main(String[] args) {   	
        TreeNode treeNode=creatTreeNode(new TreeNode());
        System.out.println(treeNode.left.root);
    }
/*
 * 创建二叉树，输入0代表结束。
 */
	public static TreeNode creatTreeNode(TreeNode treeNode) {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt(); 
		
		if(input==0){
			return null;
		}else{
			
			treeNode= new TreeNode(input);
			treeNode.left=creatTreeNode(treeNode.left);
			treeNode.right=creatTreeNode(treeNode.right);
			return treeNode;
		}
		
	}

	

}
class TreeNode{
	public int root;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int val){
		this.root=val;
	}
	public TreeNode() {
		
	}
	
}