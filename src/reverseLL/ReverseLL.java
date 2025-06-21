package reverseLL;

public class ReverseLL {

    public class LLNode {
        public int val;
        public LLNode next;

        public LLNode(int val) {
            this.val = val;
        }

    }

    
    public LLNode reverseLL(LLNode head) {
        LLNode prev = null;
        while (head != null) {
            LLNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }
}
