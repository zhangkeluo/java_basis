package job;/**
 * Created by zhangkeluo on 2019/5/5.
 */

import java.util.Stack;

/**
 * @ClassName StackImpQueue
 * @Author zhangkeluo
 * @Date 2019/5/5 9:53 PM
 *
 * 用两个栈来实现一个队列:
 * 完成队列的Push和Pop操作。 队列中的元素为int类型。
 **/
public class StackImpQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            if (stack1.isEmpty()){
                System.out.print("队列中无元素");
            }else {
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }
}
