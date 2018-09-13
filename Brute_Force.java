package com.shujujiegou;
/*
 * 串的模式匹配算法
 * Brute-Force算法
 */
public class Brute_Force {
	
	public static int bf(String S,int start, String T) {
		
		int i = start;
		int j = 0;
		int v;
		while (i < S.length() && j < T.length()) {
			if (S.substring(i, i+1).equals(T.substring(j, j+1))) {
				i++;
				j++;
			}else {
				i = i - j + 1;
				j = 0;
			}
		}
		if (j == T.length()) {
			v = i - T.length();
		}else {
			v = -1;
		}
		return v;
	}
	
	public static void main(String[] args) {
		
		String S = "cddabasddsaacdc";
		String T = "cdc";
		
		int index = bf(S, 0, T);
		System.out.println(index);
	}
}
