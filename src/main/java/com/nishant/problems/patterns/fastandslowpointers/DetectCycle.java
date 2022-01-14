package com.nishant.problems.patterns.fastandslowpointers;

public class DetectCycle {
    public static ListNode findCycleStart(ListNode head) {
        if (head == null) {
            return null;
        }
        int length = calculateCycleLength(head);
        return findStart(length, head);
    }

    private static ListNode findStart(int cycleLength, ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        // move pointer2 ahead 'cycleLength' nodes
        while (cycleLength > 0) {
            pointer2 = pointer2.next;
            cycleLength--;
        }

        // increment both pointers until they meet at the start of the cycle
        while (pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }

    private static int calculateCycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            length++;
            if (slow == fast) {
                break;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        System.out.println(DetectCycle.findCycleStart(head1));

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList cycle start: " + DetectCycle.findCycleStart(head).value);

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList cycle start: " + DetectCycle.findCycleStart(head).value);

        head.next.next.next.next.next.next = head;
        System.out.println("LinkedList cycle start: " + DetectCycle.findCycleStart(head).value);
    }

}
