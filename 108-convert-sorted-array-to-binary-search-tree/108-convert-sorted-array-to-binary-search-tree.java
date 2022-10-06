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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        return BST(nums,0,nums.length-1);
    }
    public TreeNode BST(int n[],int s,int e)
    {
        if(e<s)return null;
        int m=s+(e-s)/2;
        TreeNode root=new TreeNode(n[m]);
        root.left=BST(n,s,m-1);
        root.right=BST(n,m+1,e);
        return root;
    }
}