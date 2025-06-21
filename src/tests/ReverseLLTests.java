package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

import reverseLL.ReverseLL;

public class ReverseLLTests {
    private ReverseLL reverseLL;

    @BeforeEach
    public void setup() {
        reverseLL = new ReverseLL();
    }

    @Test
    public void testReverseThreeElements() {
        ReverseLL.LLNode head = reverseLL.new LLNode(1);
        head.next = reverseLL.new LLNode(2);
        head.next.next = reverseLL.new LLNode(3);

        ReverseLL.LLNode reversedHead = reverseLL.reverseLL(head);

        assertEquals(3, reversedHead.val);
        assertEquals(2, reversedHead.next.val);
        assertEquals(1, reversedHead.next.next.val);
        assertEquals(null, reversedHead.next.next.next);
    }

    @Test
    public void testReverseEmptyList() {
        ReverseLL.LLNode head = null;

        ReverseLL.LLNode reversedHead = reverseLL.reverseLL(head);

        assertEquals(null, reversedHead);
    }

    @Test
    public void testReverseSingleElementList() {
        ReverseLL.LLNode head = reverseLL.new LLNode(1);

        ReverseLL.LLNode reversedHead = reverseLL.reverseLL(head);

        assertEquals(1, reversedHead.val);
        assertEquals(null, reversedHead.next);
    }

    @Test
    public void testTwoElementsReverse() {
        ReverseLL.LLNode head = reverseLL.new LLNode(1);
        head.next = reverseLL.new LLNode(2);

        ReverseLL.LLNode reversedHead = reverseLL.reverseLL(head);

        assertEquals(2, reversedHead.val);
        assertEquals(1, reversedHead.next.val);
        assertEquals(null, reversedHead.next.next);
    }

    @Test
    public void testReverseTenElements() {
        ReverseLL.LLNode head = reverseLL.new LLNode(1);
        ReverseLL.LLNode current = head;
        for (int i = 2; i <= 10; i++) {
            current.next = reverseLL.new LLNode(i);
            current = current.next;
        }

        ReverseLL.LLNode reversedHead = reverseLL.reverseLL(head);

        current = reversedHead;
        for (int i = 10; i >= 1; i--) {
            assertEquals(i, current.val);
            current = current.next;
        }
        assertEquals(null, current);
    }

}
