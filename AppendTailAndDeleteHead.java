package com.mianxiangduixang;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*
 * 两个栈实现队列
 */
public class AppendTailAndDeleteHead {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	public void AppendTail(int node) {
		if (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		stack1.push(node);
	}
	
	public int DeleteHead() {
		if (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}
	
	public static void main(String[] args) {
		AppendTailAndDeleteHead a = new AppendTailAndDeleteHead();
		
		int[] arr = {3,56,74,4,21,15,36,45};
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			a.AppendTail(arr[i]);
			queue.add(a.DeleteHead());
		}
		
		for (Integer integer : queue) {
			System.out.print(integer+"\t");
		}
	}
}
