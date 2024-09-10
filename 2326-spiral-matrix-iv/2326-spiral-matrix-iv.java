/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int matrix[][] = new int[m][n];
        int top=0,left=0,right=n-1,bottom=m-1;
        ListNode curr = head;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        while(top<=bottom && left<=right){

            for(int col = left ; col <=right ; col++){
                if(curr!= null){
                    matrix[top][col] = curr.val;
                    curr = curr.next;                
                }   
            }
            top++;

            for(int row = top ; row <= bottom ; row++){
                if(curr!= null){
                    matrix[row][right] = curr.val;
                    curr = curr.next;                
                } 
            }
            right--;

            for(int col=right;col>=left;col--){
                if(curr!= null){
                    matrix[bottom][col] = curr.val;
                    curr = curr.next;                
                } 
            }
            bottom--;

            for(int row=bottom;row>=top;row--){
                if(curr!= null){
                    matrix[row][left] = curr.val;
                    curr = curr.next;                
                } 
            }
            left++;
            
        }
        return matrix;
    }

}