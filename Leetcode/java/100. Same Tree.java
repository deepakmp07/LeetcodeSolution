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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    List<String> al1 = new ArrayList<>();
    List<String> al2 = new ArrayList<>();
    if(Objects.equals(issamepreorder(p,al1)   ,issamepreorder(q,al2))){
        return true;
    }   
    else{
        return false;
    }
    }
      public List<String> issamepreorder(TreeNode p, List<String> al2){
      if(p!=null){
          if(p.left == null){
              al2.add("null");
          }
         issamepreorder(p.left , al2);
        issamepreorder(p.right , al2);
        al2.add(p.val+"");
      }
      return al2;
    }
}