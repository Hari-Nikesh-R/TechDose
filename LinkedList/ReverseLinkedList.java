


class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        return prev;
    }
    public static void main(String[] args) {
    	
    }
}