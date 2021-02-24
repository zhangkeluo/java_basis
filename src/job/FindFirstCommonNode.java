package job;/**
 * Created by zhangkeluo on 2019/5/6.
 */

import java.util.List;
import java.util.Stack;

/**
 * @ClassName FindFirstCommonNode
 * @Author zhangkeluo
 * @Date 2019/5/6 2:41 PM
 *
 * 输入两个链表，找出它们的第一个公共结点。
 **/
public class FindFirstCommonNode {
    /**
     * 遍历链表记录长度。
     同时遍历两个链表到尾部，同时记录两个链表的长度。若两个链表最后的一个节点相同，则两个链表相交。
     有两个链表的长度后，我们就可以知道哪个链表长，设较长的链表长度为len1,短的链表长度为len2。
     则先让较长的链表向后移动(len1-len2)个长度。然后开始从当前位置同时遍历两个链表，当遍历到的链表的节点相同时，则这个节点就是第一个相交的节点。

     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        if (pHead1==null || pHead2==null){
            return null;
        }
        int l1 =0,l2=0;
        while (p1.next!=null){
            l1++;
            p1=p1.next;
        }
        while (p2.next!=null){
            l2++;
            p2=p2.next;
        }
        if (p1!=p2){
            return null;
        }
        int l=0;
        p1 = pHead1;
        p2 = pHead2;
        if (l1>l2){
            l = l1-l2;
            for (int i=0;i<l;i++){
                p1 = p1.next;
            }
        }
        if (l2>l1){
            l = l2-l1;
            for (int i=0;i<l;i++){
                p2 = p2.next;
            }
        }
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    /**
     * 使用栈。
     我们可以从头遍历两个链表。创建两个栈，第一个栈存储第一个链表的节点，第二个栈存储第二个链表的节点。
     每遍历到一个节点时，就将该节点入栈。两个链表都入栈结束后。则通过top判断栈顶的节点是否相等即可判断
     两个单链表是否相交。因为我们知道，若两个链表相交，则从第一个相交节点开始，后面的节点都相交。
     若两链表相交，则循环出栈，直到遇到两个出栈的节点不相同，则这个节点的后一个节点就是第一个相交的节点

     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNodeUseStack(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null || pHead2==null){
            return null;
        }
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1!=null){
            stack1.push(p1);
            p1 = p1.next;
        }
        while (p2!=null){
            stack2.push(p2);
            p2 = p2.next;
        }
        if (stack1.peek()!=stack2.peek()){
            return null;
        }
        ListNode result = null;
        while (stack1.peek()==stack2.peek() && stack1.peek()!=null){
            result = stack1.peek();
            stack1.pop();
            stack2.pop();
        }
        return result;
    }
}
