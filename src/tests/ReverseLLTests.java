package tests;

import org.junit.Test;
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
    public void testReverseList() {
        ReverseLL.LLNode head = reverseLL.new LLNode(1);
        head.next = reverseLL.new LLNode(2);
        head.next.next = reverseLL.new LLNode(3);

        ReverseLL.LLNode reversedHead = reverseLL.reverseLL(head);

        assertEquals(3, reversedHead.val);
        assertEquals(2, reversedHead.next.val);
        assertEquals(1, reversedHead.next.next.val);
        assertEquals(null, reversedHead.next.next.next);
    }

}
