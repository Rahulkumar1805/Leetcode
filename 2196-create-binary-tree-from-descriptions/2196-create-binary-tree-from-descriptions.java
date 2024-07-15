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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer , TreeNode> isCreated = new HashMap<>();

        for(int i = 0 ; i < descriptions.length ; i++){
            //parent is not created
            if(!isCreated.containsKey(descriptions[i][0])){
                isCreated.put(descriptions[i][0] , new TreeNode(descriptions[i][0]));
            }
            //child is not present
            if(!isCreated.containsKey(descriptions[i][1])){
                isCreated.put(descriptions[i][1] , new TreeNode(descriptions[i][1]));
            }
            //both child are created.
            //now set it to left or right child of the parent node
            if(descriptions[i][2] == 1){
                isCreated.get(descriptions[i][0]).left = isCreated.get(descriptions[i][1]);
            }else
                isCreated.get(descriptions[i][0]).right = isCreated.get(descriptions[i][1]);
            
            set.add(descriptions[i][1]);
        }
        for(int desc[] : descriptions){
            if(!set.contains(desc[0])){
                return isCreated.get(desc[0]);
            }
        }
        return null;
    }
}