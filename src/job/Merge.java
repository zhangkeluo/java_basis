package job;/**
 * Created by zhangkeluo on 2019/5/6.
 */

/**
 * @ClassName Merge
 * @Author zhangkeluo
 * @Date 2019/5/6 10:37 AM
 *
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 **/
public class Merge {

    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 ==null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode corr = null;
        ListNode result =corr;

        while (list1!=null||list2!=null){
            if (list1.val >= list2.val){
                corr.next = new ListNode(list2.val);
            }else {
                corr.next = new ListNode(list1.val);
            }
            corr = corr.next;
            list1 = list1.next;
            list2 = list2.next;
        }
        if (list1 ==null){
            corr.next = list2;
        }
        if (list2 ==null){
            corr.next = list1;
        }
        return  result.next;
    }
}