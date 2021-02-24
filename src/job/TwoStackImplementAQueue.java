package job;/**
 * Created by zhangkeluo on 2019/3/20.
 */

import java.util.Stack;

/**
 * @ClassName TwoStackImplementAQueue
 * @Author zhangkeluo
 * @Date 2019/3/20 9:30 PM
 **/
public class TwoStackImplementAQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
