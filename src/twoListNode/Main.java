package twoListNode;

public class Main {
	
	public static ListNode init(int [] nums) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		ListNode tail = head;
		for(int i = nums.length-1;i>=0;i--) {
			p.val = nums[i];
			p.next = new ListNode(0);
			tail = p;
			p = p.next;
		}
		tail.next = null;
		System.gc();
		return head;
	}
	
	public static void printListNode(ListNode node) {
		if(node == null) {
			System.out.println(0);
		}
		while(node!=null) {
			System.out.print(node.val);
			if (node.next != null) {
				System.out.print("->");
				node = node.next;
			}else {
				break;
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] num1 = {3,4,5};
		int[] num2 = {2,6,2};
		ListNode l1 = init(num1);
		ListNode l2 = init(num2);
		printListNode(l1);
		printListNode(l2);
		ListNode result = Solution(l1, l2);
		printListNode(result);
	}

	public static ListNode Solution(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode p = l1, q = l2, head = result;
		int carry = 0;
		while (p != null || q != null ) {
			int x = p != null ? p.val : 0;
			int y = q != null ? q.val : 0;
			carry = (x + y + carry) / 10;
			p = p!=null?p.next:null;
			q = q!=null?q.next:null;
			head.next = new ListNode((x + y + carry) % 10);
			head = head.next;
		}
		if(carry!=0) {
			head.next = new ListNode(carry);
		}
		return result.next;
	}

}
