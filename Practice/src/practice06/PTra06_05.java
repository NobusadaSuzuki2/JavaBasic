package practice06;
/*
 * PTra06_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_05 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * ■■■■■
		 * ■■■■■
		 * ■■■■■
		 * ■■■■■
		 * ■■■■■
		 *///ファイル０６の演習問題参照
		for (int i=0;i<10;i++) {
			for (int j = 0; j <10;j++) {
			System.out.print("-");
			}
			for (int k = 0; k <10;k++) {
				System.out.print("■");
				}
			System.out.println();
		}
			
		
	}
}