class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) {
            return false;
        }
        ListNode k1=head, k2=head;
        while(k2!=null && k2.next!=null && k2.next.next!=null) {
            k1 = t1.next;
            k2 = k2.next.next;
            if(k1==k2) {
                return true;
            }
        }
    return false;
    }
}