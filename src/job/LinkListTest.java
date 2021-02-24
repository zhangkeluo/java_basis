package job;

/**
 * @ClassName LinkListTest
 * @Author zhangkeluo
 * @Date 2019/3/21 10:18 AM
 **/
public class LinkListTest {

    //链表是否有环
    public boolean existLoop(ListNode head){
        ListNode fast = head;
        ListNode low = head;
        boolean result = false;
        if (head ==null || head.next == null){
            return result;
        }
        while (low !=null && fast.next !=null){
            low = low.next;
            fast = fast.next.next;
            if (low == fast){
                result = true;
                break;
            }
        }
        return result;
    }
}
