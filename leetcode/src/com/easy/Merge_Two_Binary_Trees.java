package com.easy;

public class Merge_Two_Binary_Trees {

	public static void main(String[] args) {

	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		
		int val = (t1==null? null:t1.val) + (t2==null? null:t2.val);
		TreeNode newnode = new TreeNode(val);
		
		newnode.left = mergeTrees(t1.left== null?null:t1.left,t2.left== null?null:t2.left);
		newnode.right = mergeTrees(t1.right== null?null:t1.right,t2.right== null?null:t2.right);
		return newnode;

	}
}
