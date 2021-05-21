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
class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<List<Integer>> levelOrder = new ArrayList<>();
        if(root == null)
            return levelOrder;
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> eachLevel = new ArrayList<>();
            while(count>0 && !queue.isEmpty()){
                TreeNode temp = queue.remove();
                if(temp!=null){
                    eachLevel.add(temp.val);
                    if(temp.left !=null)
                        queue.add(temp.left);
                    if(temp.right !=null)
                        queue.add(temp.right);
                }
                  
                count--;
            }
            levelOrder.add(eachLevel);
        }
        
        return levelOrder;
    }
}
