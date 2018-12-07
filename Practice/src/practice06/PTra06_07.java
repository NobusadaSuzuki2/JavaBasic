package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for (int i=0;i<99;i++) {
			if(i<24) {
				System.out.print("-");
			}else if(i==24) {
				System.out.println("");
			}else if(i>24&&i<30) {
				System.out.print("□");
			}else if(i==30) {
				System.out.println("");
			}else if(i==31) {
				System.out.print("■");
			}else if(i>31&&i<36) {
				System.out.print("□");
			}else if(i==36) {
				System.out.println("");
			}else if(i>36&&i<39) {
				System.out.print("■");
			}else if(i>39&&i<43) {
				System.out.print("□");
			}else if(i==43) {
				System.out.println("");
			}else if(i>43&&i<47) {
				System.out.print("■");
			}else if(i>47&&i<50) {
				System.out.print("□");
			}else if(i==50) {
				System.out.println("");
			}else if(i>50&&i<55) {
				System.out.print("■");
			}else if(i==55) {
				System.out.print("□");
			}else if(i==56) {
				System.out.println("");
			}else if(i>56&&i<62) {
				System.out.print("■");
			}
		}
	}
}
