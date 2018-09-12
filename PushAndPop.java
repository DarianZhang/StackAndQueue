package com.mianxiangduixang;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 两个队列实现栈
 */
public class PushAndPop {

	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();
	
	public void push(int node) {
		if(queue1.isEmpty() && queue2.isEmpty()){
			queue1.add(node);
			return;
		}
		if (!queue1.isEmpty()) {	
			queue1.add(node);
			return;
		}
		if (!queue2.isEmpty()) {
			queue2.add(node);
			return;
		}
	}
	
	public int pop() {
		if(queue1.isEmpty() && queue2.isEmpty()){
			try {
				throw new Exception("Stack is empty");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (!queue1.isEmpty()) {	
			while (queue1.size() > 1) {
				queue2.add(queue1.poll());
			}
			return queue1.poll();
		}
		if (!queue2.isEmpty()) {
			while (queue2.size() > 1) {
				queue1.add(queue2.poll());
			}
			return queue2.poll();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		PushAndPop pap = new PushAndPop();
		int[] arr = {3,26,56,74,4,21,100,15,36,45};
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			pap.push(arr[i]);
			stack.push(pap.pop());
		}
		/*for (int i = 0; i < arr.length; i++) {
			stack.push(pap.pop());
		}*/
		
		System.out.println(stack.pop());
	}
}
