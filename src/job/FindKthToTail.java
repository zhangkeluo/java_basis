package job;/**
 * Created by zhangkeluo on 2019/5/5.
 */

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.List;

/**
 * @ClassName FindKthToTail
 * @Author zhangkeluo
 * @Date 2019/5/5 10:20 PM
 **/
public class FindKthToTail {
    public ListNode findKthToTail(ListNode list,int k){
        if (list==null || k<=0){
            return null;
        }
        ListNode fast=list,slow=list;
        for (int i=0;i<k-1;i++){
            fast = fast.next;
            if (fast == null){
                return null;
            }
        }

        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
