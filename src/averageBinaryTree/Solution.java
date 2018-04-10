package averageBinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Solution {
	
	public TreeNode init(List<String> input) {
		if (input.size() == 0 || input.get(0).equals("null")) {
			return null;
		}
		TreeNode root = new TreeNode(Integer.parseInt(input.get(0)));
		Deque<TreeNode> deque = new LinkedList<>();
		deque.add(root);
		Iterator<String> iterator = input.iterator();
		iterator.next();
		boolean flag = false;
		while(iterator.hasNext()) {
			TreeNode parent = deque.getFirst();
			String temp = iterator.next();
			
			TreeNode node = null;
			if(!temp.equals("null"))
				node = new TreeNode(Integer.parseInt(temp));
			if(!flag) {
				parent.left = node;flag = true;
			}
			else {
				parent.right = node;flag = false;deque.removeFirst();
			}
			deque.addLast(node);
			
		}
		return root;
	}
	
	public List<Double> averageLevels(TreeNode root) {
		Map<Integer, Integer> nodeMap = new HashMap<>();
		Map<Integer, Double> sumMap = new HashMap<>();
		
		traverse(root, 0, nodeMap, sumMap);
		
		List<Double> result = new ArrayList<>();
		
		
		for(int i = 0;i<nodeMap.size();i++) {
			 result.add(sumMap.get(i)/(nodeMap.get(i)*1.0));
		}
		
		return result;
		
	}
	
	public void traverse(TreeNode root,int level,Map<Integer,Integer> nodes,Map<Integer,Double> sum) {
		if(root == null)
			return;
		if(nodes.containsKey(level))
			nodes.put(level, nodes.get(level)+1);
		else
			nodes.put(level, 1);
		if(sum.containsKey(level))
			sum.put(level, sum.get(level)+root.getVal());
		else
			sum.put(level, (double)root.getVal());
		
		traverse(root.left, level+1, nodes, sum);
		traverse(root.right, level+1, nodes, sum);
		
	}
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		String[] input = new String[] {"2147483647","2147483647","2147483647"};
		List<String> strings = Arrays.asList(input);
		
		TreeNode head = solution.init(strings);
		List<Double> result = solution.averageLevels(head);
		for (double d : result) {
			System.out.println(d);
		}
		
		System.out.println(2147483647+2147483647);
	}

}
