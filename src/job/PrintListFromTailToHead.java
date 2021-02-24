package job;/**
 * Created by zhangkeluo on 2019/3/14.
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName PrintListFromTailToHead
 * @Author zhangkeluo
 * @Date 2019/3/14 5:38 PM
 **/
public class PrintListFromTailToHead {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        printListFromTailToHead(node1);
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listnode) {
        ArrayList<Integer> arrayList = null;
        Stack<Integer> stack = new Stack<>();
        if (listnode != null){
            int length = 0;
            while (listnode !=null){
                stack.push(listnode.val);
                listnode = listnode.next;
                length++;
            }
            arrayList = new ArrayList<>(length);
            while (!stack.isEmpty()){
                arrayList.add(stack.pop());
            }
        }
        return arrayList;
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
            this.val = val;
        }
    }