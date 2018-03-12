package mergeBinaryTree;

public class Solution {
	
	public static TreeNode init(String [] leaves) {
		TreeNode head = new TreeNode(0);
		TreeNode p = head;

		if(leaves.length == 0) {
			return head.left;
		}
		
		for (int i = 0; i < leaves.length; i++) {
			if (leaves[i].equals("null")) {
				p.left = null;
			}
			else {
			}
			i++;
			if(leaves[i].equals("null")){
				p.right = null;
			}
			else {
				p.right = new TreeNode(Integer.parseInt(leaves[i]));
			}
		}
		
		return head.left;
	}

}
