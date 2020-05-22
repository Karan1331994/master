/*
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.

*/




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int max(int a, int b)   //function to determine max between two nos
    {
        if(a>b)
            return a;
        else
            return b;
    }
    
    public int maxHeight(TreeNode node)		//function to determine max height of tree
    {
        if(node==null)
            return 0;
        int lheight=maxHeight(node.left);
        int rheight=maxHeight(node.right);
        
        return (max(lheight,rheight)+1);
    }
    public int diameterOfBinaryTree(TreeNode root) {	//function to determine diameter of Binary Tree
         if(root==null)
            return 0;
        int lheight=maxHeight(root.left);
        int rheight=maxHeight(root.right);
        
        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        
        return max(lheight+rheight,max(ld,rd));		/* Return max of following three:
														1) Diameter of left subtree 
														2) Diameter of right subtree 
														3) Height of left subtree + height of right subtree
														*/ 
        
    }
}